## Compile

```
javac -d appmodules --module-source-path appsrc  appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java
```

## Run module applicatiom

```
java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo
```