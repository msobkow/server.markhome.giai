#!/bin/bash
export build_tag=$*
if [ "$build_tag" == "" ]; then
	echo "PackageDbScripts213.bash ERROR A single argument build tag must be specified"
else
	if [ "${MSSCF_HOME}" == "" ]; then
		echo "PackageDbScripts213.bash ERROR MSSCF_HOME environment variable not found or is empty"
	else
		if [ ! -d ${MSSCF_HOME} ]; then
			echo "PackageDbScripts213.bash ERROR MSSCF_HOME directory ${MSSCF_HOME} does not exist"
		else
			pushd ${MSSCF_HOME}
				for aproj in cflib cfcore cfsec cfint cfbam msscf cfkbase cfmodel
				do
					if [ -d ${aproj}_2_13 ]; then
						pushd ${aproj}_2_13
							if [ ! -d installer ]; then
								mkdir installer
								chmod 755 installer
							fi
							if [ -f PackageDbScripts*.bash ]; then
								./PackageDbScripts*.bash $build_tag
							fi
						popd
					fi
				done
			popd
		fi
	fi
fi
