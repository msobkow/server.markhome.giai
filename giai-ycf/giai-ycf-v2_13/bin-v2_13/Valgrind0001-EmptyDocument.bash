cd $MSSCF_HOME/cfsec_2_13/java/bin
echo "0001-EmptyDocument.xml"
valgrind --leak-check=yes cfsecramloader Cluster=Insert testdata/0001-EmptyDocument.xml
