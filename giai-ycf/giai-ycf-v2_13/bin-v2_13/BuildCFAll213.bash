#!/bin/bash
cd $MSSCF_HOME
let MavenStatus=0
cd $MSSCF_HOME/v2_13-maven/org.msscf.msscf
mvn -U install
let MavenStatus=$?
if [ $MavenStatus != 0 ]; then
	echo "ERROR: mvn install for ${aprojdir} returned status ${MavenStatus} - build aborted"
fi
if [ $MavenStatus == 0 ]; then
	cp -v $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13.CFCli/target/org.msscf.msscf.v2_13.CFCli-2.13.42-alpha16-202611071400-spring-boot.jar $MSSCF_HOME/v2_13-maven/org.msscf.msscf/bin-v2_13/
	cp -v $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13.CFCli/target/org.msscf.msscf.v2_13.CFCli-2.13.42-alpha16-202611071400-spring-boot.jar $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13-installer/bin-v2_13/
	cp -v $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13.cfcore/resources/xsd/*.xsd $YCF_HOME/server.markhome.giai/giai-ycf/server.markhome.ycf/src/main/doc/giai-html/giai-ycf/msscf/2.0.13/xsd/
	cp -v $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13.cfcore/resources/xsd/*.xsd $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13-installer/website-v2_13/msscf/2.0.13/xsd/
	cp -v $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13.cfbam.CFBamSaxLoader/src/main/resources/xsd/*.xsd $YCF_HOME/server.markhome.giai/giai-ycf/server.markhome.ycf/src/main/doc/giai-html/giai-ycf/msscf/2.0.13/xsd/
	cp -v $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13.cfbam.CFBamSaxLoader/src/main/resources/xsd/*.xsd $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13-installer/website-v2_13/msscf/2.0.13/xsd/
	cp -v $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13.cfbamcust.CFBamXmlLoader/src/main/resources/xsd/mssbam-2.13.xsd $YCF_HOME/server.markhome.giai/giai-ycf/server.markhome.ycf/src/main/doc/giai-html/giai-ycf/msscf/2.0.13/xsd/
	cp -v $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13.cfbamcust.CFBamXmlLoader/src/main/resources/xsd/mssbam-2.13.xsd $MSSCF_HOME/v2_13-maven/org.msscf.msscf/org.msscf.msscf.v2_13-installer/website-v2_13/msscf/2.0.13/xsd/
	echo "SUCCESS: All 2.13 Java builds completed successfully"
fi
cd $MSSCF_HOME
