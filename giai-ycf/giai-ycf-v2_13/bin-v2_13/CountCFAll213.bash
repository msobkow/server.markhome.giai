#!/bin/bash
cd $MSSCF_HOME/v2_13-maven
mydate=`date +%Y-%m-%d-%Hh%M`
codecount org.* cfkbase_2_13 cfmodel_2_13 | tee $HOME/count-v2_13-${mydate}.txt
