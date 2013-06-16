#!/bin/sh

JAVA_HOME=/local/opt/jdk1.6.0_37
PROBLEM=problem5
rm -frv out/production/studying/org/karpukhin/elance/$PROBLEM
$JAVA_HOME/bin/javac -d out/production/studying src/org/karpukhin/elance/$PROBLEM/Main.java
cat $PROBLEM-data | $JAVA_HOME/bin/java -cp out/production/studying org.karpukhin.elance.$PROBLEM.Main
