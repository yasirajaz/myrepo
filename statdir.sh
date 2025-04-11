#!/bin/bash
if [ $# -eq 0 ]
then
	echo "path is provided as argument"
fi
file=$1
if [ -e $file ]
then
	echo "$file exist"
	if [ -r $file ]
	then
		echo "$file is readable"
	else
		echo "$file is not readable"
	fi
	if [ -w $file ]
	then
		echo "$file is writable"
	else
		echo "$file is not wrtable"
	fi
	if [ -x $file ]
	then
		echo "$file  is executable"
	else
		echo "$file is not executable"
	fi
else
	echo "$file doesnt exists"
fi
