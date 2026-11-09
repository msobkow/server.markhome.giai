#!/bin/bash
if [ "$1" != "" ]; then
	export CLIARG1="$1"
else
	unset CLIARG1
fi
if [ "$2" != "" ]; then
	export CLIARG2="$2"
else
	unset CLIARG2
fi
if [ "$3" != "" ]; then
	export CLIARG3="$3"
else
	unset CLIARG3
fi
if [ "$4" != "" ]; then
	export CLIARG4="$4"
else
	unset CLIARG4
fi
cd $MSSCF_HOME
for aprojdir in \
	v2_13-maven/org.msscf.msscf.v2_13 \
	v2_13-maven/org.msscf.msscf.v2_13.cflib.CFLib \
	v2_13-maven/org.msscf.msscf.v2_13.cflib.CFLib.JavaFX \
	v2_13-maven/org.msscf.msscf.v2_13.cfcore \
	v2_13-maven/org.msscf.msscf.v2_13.cfsec \
	v2_13-maven/org.msscf.msscf.v2_13.cfsec.CFSecSaxLoader \
	v2_13-maven/org.msscf.msscf.v2_13.cfsec.CFSecRam \
	v2_13-maven/org.msscf.msscf.v2_13.cfint \
	v2_13-maven/org.msscf.msscf.v2_13.cfint.CFIntSaxLoader \
	v2_13-maven/org.msscf.msscf.v2_13.cfint.CFIntRam \
	v2_13-maven/org.msscf.msscf.v2_13.cfbam \
	v2_13-maven/org.msscf.msscf.v2_13.cfbam.CFBamSaxLoader \
	v2_13-maven/org.msscf.msscf.v2_13.cfbam.CFBamRam \
	v2_13-maven/org.msscf.msscf.v2_13.cfbam.CFBamMssCF \
	v2_13-maven/org.msscf.msscf.v2_13.cfbamcust.MSSBamCF \
	v2_13-maven/org.msscf.msscf.v2_13.cfbamcust.CFBamXmlLoader \
	v2_13-maven/org.msscf.msscf.v2_13.cfmodel \
	v2_13-maven/org.msscf.msscf.v2_13.cfkbase \
	v2_13-maven/org.msscf.msscf.v2_13.CFCli
do
	pushd ${aprojdir}
	export CMD="git $CLIARG1 $CLIARG2 $CLIARG3 $CLIARG4 $CLIARG5"
	#echo "CMD is \"$CMD\""
	eval $CMD
	popd
done
cd $MSSCF_HOME
