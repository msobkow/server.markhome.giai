#!/bin/bash
rawBuildString="$1"
toolsetNames=$2 $3 $4 $5 $6 $7 $8 $9
. $MSSCF_HOME/v2_13-maven/bin-v2_13/initbuild
if [ "${rawBuildString}" != "" ]; then
	buildString="${rawBuildString}-${BUILD_STAMP}"
else
	buildString="${BUILD_STAMP}"
fi
cd $MSSCF_HOME/v2_13-maven/bin-v2_13
./CFManufactureCode213Java.bash ${buildString} server-markhome-ycf-Core-3-1-Core server-markhome-ycf-30-layered+ycf ${toolsetNames}
cd $MSSCF_HOME
