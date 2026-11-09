#!/bin/bash
if [ "$MSSCF_HOME" != "" ]; then
	if [ -d "$MSSCF_HOME/v2_13-maven" ]; then
		cd "$MSSCF_HOME/v2_13-maven"
			for adir in *
			do
				pushd $adir
				chmod 755 `find . -name '*.bash'`
				git add `find . -name '.gitignore' -o -name '*.bash'`
				git update-index --add --chmod=+x `find . -name '*.bash'`
				popd
			done
		/usr/bin/ls -l --block-size=M
	fi
fi
