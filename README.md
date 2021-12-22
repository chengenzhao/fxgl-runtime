# fxgl-runtime
A Custom FXGL runtime in different operating systems e.g. macOSX, using jlink command.  
It will use Github Action to build custom runtime of FXGL, Kotlin, JavaFX and JDK.  
  
Let's say you have a maven project of fxgl, Xtrike for example.  
then you build xtrike.jar with main class: com.whitewoodcity.xtirke.Main just like traditional maven project.  
  
You may use this project and github action to generate fxgl runtime e.g. macosxrt.zip(macosx runtime). 
then download this zip from github action and then unzip it. 
and java command is in bin directory. 
then use it like. 
```java
macosxrt/bin/java -cp xtrike.jar com.whitewoodcity.xtrike.Main
```
then wolala you will see the nice game or javafx interface you build using FXGL, JavaFX, Kotlin etc.  

Note: Make sure the dependencies in pom.xml and module-info.java are the same as your game project.
