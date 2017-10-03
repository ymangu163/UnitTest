- 常用ADB命令
-- adb devices
-- adb push/pull
    如：#adb -s 50a65bc0 push 05000453.jpg /data/temp/2.jpg   （发送到手机的某个目录上）
       #adb -s 50a65bc0 pull /data/temp/2.jpg 124.jpg

-- adb forword
    adb forward tcp:1080 tcp:1080  (把电脑端的1080端口 重定向到 手机端的 1080端口)
-- adb start-server /kill-server
-- adb install/uninstall
-- adb shell

- shell命令
-- pm list packages  (查看手机上的应用包名)
-- exit （退出shell）


- Android命令
-- Android sdk
-- Android avd
-- Android list
-- Android create project


- monitor 工具使用
-- 打开命令：#monitor


- Monkey 命令
-- adb shell monkey [options] <event-count>
    如：#adb shell monkey -p free.vpn.unblock.proxy.freenetvpn -v 100


-- Monkey脚本 命令
 DispatchPointer    DispatchPress   LaunchActivity  UsweWait
 RotateScreen   Tap


- app 测试
https://developer.android.com/studio/test/index.html


- monkeyrunner
>monkeyrunner
>>> from com.android.monkeyrunner import MonkeyRunner,MonkeyDevice,MonkeyImage
>>>  MonkeyRunner.alert('Monkey Runner alert','ymangu','OK')


- monkeyDevice
>monkeyrunner
>>> from com.android.monkeyrunner import MonkeyRunner as mr,MonkeyDevice as md
>>> device = mr.waitForConnection()
>>> device.installPackage("path")



