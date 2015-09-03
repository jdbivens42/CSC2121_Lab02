@echo off
cls

set path="c:\Program Files\Java\jdk1.7.0_45\bin";c:\Windows
set classpath="c:\Program Files\Java\jdk1.7.0_45\bin";.;matrix.jar

javac -cp %classpath% Equations.java
java -cp %classpath% Equations