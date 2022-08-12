###First compile and run


Compile SimpleMathFuncs.java

'''
javac -d appmodules\appfuncs appsrc\appfuncs\appfuncs\simplefuncs\SimpleMathFuncs.java
'''

Compile module-info

'''
javac -d appmodules/appfuncs appsrc/appfuncs/module-info.java
'''

-----------------------------

Combine two commands

'''
javac -d appmodules/appfuncs appsrc/appfuncs/module-info.java appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java
'''


Compile  '''module-info.java''' and MyModsAppDemo.java'''

'''
javac --module-path appmodules -d appmodules/appstart appsrc/appstart/module-info.java appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java
'''

Run module applicatiom

'''
java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo
'''