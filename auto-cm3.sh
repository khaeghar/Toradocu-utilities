
#!/bin/bash

FOLDERDIR=/home/sergio/Repositories/toradocu
PACKAGEANDCLASS=org.apache.commons.math3.geometry.spherical.twod.S2Point

rm /home/sergio/Toradocu/CommonsMath3/$PACKAGEANDCLASS.json

/usr/bin/java -jar /home/sergio/Repositories/toradocu/build/libs/toradocu-1.0-all.jar \
--target-class $PACKAGEANDCLASS \
--source-dir $FOLDERDIR/src/test/resources/src/commons-math3-3.6.1-src/commons-math3-3.6.1-src/src/main/java \
--class-dir $FOLDERDIR/src/test/resources/bin/commons-math3-3.6.1.jar \
--oracle-generation false \
--condition-translator-output /home/sergio/Toradocu/CommonsMath3/$PACKAGEANDCLASS.json \
--debug


