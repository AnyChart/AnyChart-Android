package com.anychart.anychart.chart.common.enums;

/**
 * Created by arseny on 8/7/17.
 */

public enum OverlapMode {
    ALLOW_OVERLAP("allowOverlap"),
    NO_OVERLAP("noOverlap");

    private final String mode;

    OverlapMode(String mode) {
        this.mode = mode;
    }

    public String get() { return mode; }

}
