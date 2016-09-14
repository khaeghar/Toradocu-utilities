#!/bin/bash

rm /home/sergio/Toradocu/TestSingularPlural.json

/usr/bin/java -jar /home/sergio/Repositories/toradocu-dev/build/libs/toradocu-dev-1.0-devel-all.jar \
--target-class com.TestSingularPlural \
--source-dir /home/sergio/Repositories/toradocu-testing/src \
--class-dir /home/sergio/Repositories/toradocu-testing/bin \
--oracle-generation false \
--condition-translator-output /home/sergio/Toradocu/TestSingularPlural.json
