#!/bin/bash

for A in $(cat eztaxon_id_taxa.txt)
do
	echo $A | grep -c ";"
	#if [[ $num_taxa -eq 6  ]]
	#then
	#	echo $A
	#fi
done
