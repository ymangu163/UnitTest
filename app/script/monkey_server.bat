# adb forward tcp:1080 tcp:1080
# telent 127.0.0.1 1080

adb forward tcp:1080 tcp:1080

adb shell am start -n com.android.calculator2/com.android.calculator2.Calculator

start telnet.exe
cscript //nologo .\monkey_server_run.vbs