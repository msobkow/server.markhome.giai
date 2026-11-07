#!/bin/bash
if [ "$GIAI_HOME" == "" ]
then
	if [ ! -d /opt/giai ]
	then
		sudo mkdir /opt/giai
		sudo chown $USER:$USER /opt/giai
	fi
	export GIAI_HOME=/opt/giai
fi
if [ "$GIAI_HOME" != "" ]
then
	pushd $GIAI_HOME
	for arepo in msobkow.github.io server.markhome.giai
	do
		if [ ! -d $arepo ]; then
			git clone git@github.com:msobkow/${arepo}.git
		fi
	done
	popd
fi
