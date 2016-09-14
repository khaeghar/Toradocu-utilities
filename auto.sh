#!/bin/bash

rm /home/sergio/Toradocu/TestPlural.json

/usr/bin/java -jar /home/sergio/Repositories/toradocu-dev/build/libs/toradocu-dev-1.0-devel-all.jar \
--target-class com.TestPlural \
--source-dir /home/sergio/Repositories/toradocu-testing/src \
--class-dir /home/sergio/Repositories/toradocu-testing/bin \
--oracle-generation false \
--condition-translator-output /home/sergio/Toradocu/TestPlural.json
