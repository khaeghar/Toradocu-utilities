#!/bin/bash

rm /home/sergio/Toradocu/Toradocu-test/TestArithmetics.json

/usr/bin/java -jar /home/sergio/Repositories/toradocu-dev/build/libs/toradocu-dev-1.0-devel-all.jar \
--target-class com.TestArithmetics \
--source-dir /home/sergio/Repositories/toradocu-testing/src \
--class-dir /home/sergio/Repositories/toradocu-testing/bin \
--oracle-generation false \
--condition-translator-output /home/sergio/Toradocu/TestArithmetics.json
