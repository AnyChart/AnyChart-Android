package com.anychart.sample;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChartsAdapter extends RecyclerView.Adapter<ChartsAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        private Context context;

        ViewHolder(Context context, View itemView) {
            super(itemView);

            this.context = context;
            tvName = itemView.findViewById(R.id.tv_name);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                Chart chart = chartList.get(position);

                Intent intent = new Intent(context, chart.getActivityClass());
                context.startActivity(intent);
            }
        }
    }

    private List<Chart> chartList;
    private List<Chart> copyChartList;
    private Context context;

    ChartsAdapter(Context context, List<Chart> chartList) {
        this.chartList = chartList;
        copyChartList = new ArrayList<>(chartList);
        this.context = context;
    }

    private Context getContext() {
        return context;
    }

    @Override
    public ChartsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        return new ViewHolder(context, inflater.inflate(R.layout.card_view_chart, parent, false));
    }

    @Override
    public void onBindViewHolder(ChartsAdapter.ViewHolder viewHolder, int position) {
        Chart chart = chartList.get(position);

        TextView textView = viewHolder.tvName;
        textView.setText(chart.getName());
    }

    @Override
    public int getItemCount() {
        return chartList.size();
    }

    public void filter(String text) {
        chartList.clear();
        if (text.isEmpty()){
            chartList.addAll(copyChartList);
        } else{
            text = text.toLowerCase();
            for (Chart chart: copyChartList){
                if (chart.getName().toLowerCase().contains(text)) {
                    chartList.add(chart);
                }
            }
        }
        notifyDataSetChanged();
    }
}
