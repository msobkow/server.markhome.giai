#!/bin/bash
cd $MSSCF_HOME
pushd cflib_2_13/java
./Pack* $*
popd
pushd cfcore_2_13/java
./Pack* $*
popd
pushd cfsec_2_13/java
./Pack* $*
popd
pushd cfint_2_13/java
./Pack* $*
popd
pushd cfbam_2_13/java
./Pack* $*
popd
pushd msscf_2_13/java
./Pack* $*
popd
#pushd cfkbase_2_13/java
#./Pack* $*
#popd
cd $MSSCF_HOME
