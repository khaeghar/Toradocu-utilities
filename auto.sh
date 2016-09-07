#!/bin/bash

/usr/bin/java -jar /home/sergio/Repositories/toradocu/build/libs/toradocu-0.1-all.jar \
--targetClass com.google.common.collect.ArrayListMultimap \
-J-encoding=UTF-8 \
-J-sourcepath=/home/sergio/Repositories/toradocu/src/test/resources/guava-19.0-sources \
--oracleGeneration false \
--saveConditionTranslatorOutput /home/sergio/Repositories/toradocu/build/libs/aqui.txt


