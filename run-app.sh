#!/bin/bash
mvn clean compile install
STATUS=$?
if [ $STATUS -eq 0 ]; then
echo "**********Build Successful**********"
echo "*****************************Application class Execution Start*****************************"
mvn exec:java
echo "*****************************Application class Execution Stop*****************************"
else
echo "**********Build Failed**********"
fi