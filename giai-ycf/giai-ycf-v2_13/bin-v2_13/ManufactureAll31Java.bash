#!/bin/bash
#!/bin/bash
rawBuildString="$1"
toolsetNames=$2 $3 $4 $5 $6 $7 $8 $9
export SaveDir=`pwd`
. $GIAI_HOME/server.markhome.giai.giaiycf/bin-v2_13/initbuild
if [ "${rawBuildString}" != "" ]; then
	buildString="${rawBuildString}-${BUILD_STAMP}"
else
	buildString="${BUILD_STAMP}"
fi
cd $GIAI_HOME/server.markhome.giai.giaiycf/bin-v2_13
./ManufactureSecure31Java.bash ${rawBuildString} ${toolsetName$}
./ManufactureInterNet31Java.bash ${rawBuildString} ${toolsetName$}
./ManufactureBusModel31Java.bash ${rawBuildString} ${toolsetName$}
cd $SaveDir
