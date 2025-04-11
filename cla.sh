#!/bin/bash
if [ $# -eq 0 ]
then
	echo "no arguments"
else
	for name in $*
	do
		echo "$name"
	done
fi
