#!/bin/bash
export args=$*
export restore=`pwd`
. $MSSCF_HOME/v2_13-maven/org.msscf.msscf/bin-v2_13/initbuild
cd $MSSCF_HOME/v2_13-maven/org.msscf.msscf/bin-v2_13
./ManufactureSecure31Java.bash $args
./ManufactureIntNet31Java.bash $args
./ManufactureCore31Java.bash $args
#./ManufactureDbTest31Java.bash $args
./ManufactureBusModel31Java.bash $args
cd $MSSCF_HOME
