# fxgl-runtime
A Custom FXGL runtime in different operating systems e.g. macOSX, using jlink command.  
It will use Github Action to build custom runtime of FXGL, Kotlin, JavaFX and JDK.  
   
Let's say you have a maven project of fxgl, Xtrike for example.   
then you build xtrike-1.0.jar with main class: com.whitewoodcity.xtirke.Main just like traditional maven project.   
   
You may use this project and github action to generate fxgl runtime e.g. macosxrt.zip(macosx runtime).  
then download this zip from github action and then unzip it.  
and java command is in bin directory.   
then use it like:   
```java
macosxrt/bin/java -cp xtrike-1.0.jar com.whitewoodcity.xtrike.Main
```
or in module jar with module name: com.whitewoodcity.xtrike
```java
macosxrt/bin/java --module-path xtrike-1.0.jar -m com.whitewoodcity.xtrike/com.whitewoodcity.xtrike.Main
```
then ohlala you will see the nice game or javafx interface you built using FXGL, JavaFX, Kotlin etc.   
    
Note: Make sure the dependencies in pom.xml and module-info.java are the same as your game project.    
