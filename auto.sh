#!/bin/bash

CLASS=DescriptiveStatistics
FOLDERDIR=/home/sergio/Repositories/commons-math3-3.6.1-src
PACKAGE=org.apache.commons.math3.stat.descriptive


rm /home/sergio/Toradocu/$CLASS.json

/usr/bin/java -jar /home/sergio/Repositories/toradocu-dev/build/libs/toradocu-dev-1.0-devel-all.jar \
--target-class $PACKAGE.$CLASS \
--source-dir $FOLDERDIR/src/main/java \
--class-dir $FOLDERDIR/target/classes \
--oracle-generation false \
--condition-translator-output /home/sergio/Toradocu/$CLASS.json
