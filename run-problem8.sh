#!/bin/sh

JAVA_HOME=/local/opt/jdk1.6.0_37
rm -frv out/production/studying/org/karpukhin/elance/problem8
$JAVA_HOME/bin/javac -d out/production/studying src/org/karpukhin/elance/problem8/Main.java
cat data | $JAVA_HOME/bin/java -cp out/production/studying org.karpukhin.elance.problem8.Main
