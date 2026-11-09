#!/bin/bash
cd $MSSCF_HOME/cfbam_2_13/java/bin
if [ "$LOG4J2_CONF" != "" ]; then
	export JAVA_LOG4J="-Dlog4j.configurationFile=$LOG4J2_CONF"
else
	export JAVA_LOG4J=""
fi
export PATH=".:$PATH"
$JAVA $JAVA_LOG4J -Xms1023M --module-path "./lib${JSEP}com.github.msobkow.cfbam.CFBamSaxRamLdr.jar${JSEP}com.github.msobkow.cfbam.jar${JSEP}com.github.msobkow.cfbam.CFBamRam.jar${JSEP}com.github.msobkow.cfbam.CFBamSaxLoader.jar${JSEP}com.github.msobkow.cfint.jar${JSEP}com.github.msobkow.cfsec.jar${JSEP}com.github.msobkow.cflib.CFLib.jar" -m com.github.msobkow.cfbam.CFBamSaxRamLdr/com.github.msobkow.cfbam.CFBamSaxRamLdr.CFBamSaxRamLdr Cluster=Insert testdata/0001-CreateComplexModel.xml
