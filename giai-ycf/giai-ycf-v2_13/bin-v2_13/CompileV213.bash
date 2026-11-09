#!/bin/bash
pushd $MSSCF_HOME/v2_13-maven
for adir in org.msscf.msscf.v2_13 org.msscf.msscf.v2_13.cflib.CFLib org.msscf.msscf.v2_13.cflib.CFLib.JavaFX org.msscf.msscf.v2_13.cfcore org.msscf.msscf.v2_13.cfsec org.msscf.msscf.v2_13.cfsec.CFSecRam org.msscf.msscf.v2_13.cfsec.CFSecSaxLoader org.msscf.msscf.v2_13.cfint org.msscf.msscf.v2_13.cfint.CFIntRam org.msscf.msscf.v2_13.cfint.CFIntSaxLoader org.msscf.msscf.v2_13.cfbam org.msscf.msscf.v2_13.cfbam.CFBamMssCF org.msscf.msscf.v2_13.cfbam.CFBamRam org.msscf.msscf.v2_13.cfbam.CFBamSaxLoader org.msscf.msscf.v2_13.cfbamcust.MSSBamCF org.msscf.msscf.v2_13.cfbamcust.CFBamXmlLoader org.msscf.msscf.v2_13.CFCli
do
	pushd $adir
		mvn $*
	popd
done
popd
