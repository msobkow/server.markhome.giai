#!/bin/bash
if [ "$MSSCF_HOME" == "" ]
then
	if [ ! -d /opt/msscode ]
	then
		sudo mkdir /opt/msscode
		sudo chown $USER:$USER /opt/msscode
	fi
	export MSSCF_HOME=/opt/msscode
	export MSSCFHOME=$MSSCF_HOME
fi
if [ "$MSSCF_HOME" != "" ]
then
	if [ ! -d $MSSCF_HOME/v2_13-maven ]
	then
		mkdir $MSSCF_HOME/v2_13-maven
	fi
	pushd $MSSCF_HOME/v2_13-maven
	if [ ! -d org.msscf.msscf ]
	then
		git clone git@github.com:msobkow/org.msscf.msscf.git
	fi
	popd
fi
