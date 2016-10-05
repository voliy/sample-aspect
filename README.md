# AspectJ Weaving

## Load-Time Weaving
Add `-javaagent:./target/lib/aspectjweaver.jar` to VM options

## Compile-Time Weaving
- Install ajc by command `java -jar aspectj-1.8.9.jar` and add it to PATH
- Run command `ajc -classpath /c/aspectj1.8/lib/aspectjrt.jar *.java -source 1.6`
