#!/bin/bash
CLASSPATH=~/.m2/repository/io/ciera/io.ciera.runtime/1.1.1/io.ciera.runtime-1.1.1.jar:~/.m2/repository/org/antlr/antlr4/4.7.1/antlr4-4.7.1.jar:~/.m2/repository/org/antlr/antlr4-runtime/4.7.1/antlr4-runtime-4.7.1.jar:~/.m2/repository/org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar:~/.m2/repository/org/antlr/ST4/4.0.8/ST4-4.0.8.jar:~/.m2/repository/org/abego/treelayout/org.abego.treelayout.core/1.0.3/org.abego.treelayout.core-1.0.3.jar:~/.m2/repository/org/glassfish/javax.json/1.0.4/javax.json-1.0.4.jar:~/.m2/repository/com/ibm/icu/icu4j/58.2/icu4j-58.2.jar:~/.m2/repository/org/json/json/20180813/json-20180813.jar:~/.m2/repository/io/ciera/GPS_Watch/1.0.0-SNAPSHOT/GPS_Watch-1.0.0-SNAPSHOT.jar
java -cp $CLASSPATH gui.WatchGui
