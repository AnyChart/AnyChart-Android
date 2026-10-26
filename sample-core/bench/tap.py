import re,subprocess,sys
needle=sys.argv[1]
subprocess.run(["adb","shell","uiautomator","dump","/sdcard/ui.xml"],capture_output=True)
xml=subprocess.run(["adb","shell","cat","/sdcard/ui.xml"],capture_output=True,text=True).stdout
for m in re.finditer(r'<node[^>]*text="([^"]*)"[^>]*bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"',xml):
    t,x1,y1,x2,y2=m.groups()
    if needle.lower() in t.lower():
        cx,cy=(int(x1)+int(x2))//2,(int(y1)+int(y2))//2
        subprocess.run(["adb","shell","input","tap",str(cx),str(cy)]); print("tapped",t,cx,cy); break
else: print("NOT FOUND:",needle); sys.exit(1)
