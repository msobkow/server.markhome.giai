#!/bin/bash
if [ "${MSSCF_HOME}" == "" ]; then
	echo "UpdateChangeLogsCFAll213.bash ERROR MSSCF_HOME environment variable not found or is empty"
else
	if [ ! -d ${MSSCF_HOME} ]; then
		echo "UpdateChangeLogsCFAll213.bash ERROR MSSCF_HOME directory ${MSSCF_HOME} does not exist"
	else
		cd ${MSSCF_HOME}
	for adir in *2_13/cplus
		do
			pushd $adir
				for alog in `find . -name 'ChangeLog'`
				do
					echo $alog
					git log 2>&1 >$alog
				done
			popd
		done
	for adir in *2_13/java
		do
			pushd $adir
				git log 2>&1 >ChangeLog
			popd
		done
	fi
	for adir in *3_1/java
		do
			pushd $adir
				git log 2>&1 >ChangeLog
			popd
		done
	fi
fi
