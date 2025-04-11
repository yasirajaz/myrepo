#!/bin/bash
x="/etc/"
if [ -d $x ];then
	echo "$x is an exixting directory"
	cd $x
	pwd
else
	echo "$x is not  an exixting directory"
fi
if [ -r $x ];then
	echo "$x is readable"
else
	echo "$x is not readable"
fi
if [ -w $x ];then
	echo "writable"
else
	echo "not writable"
fi
if [ -x $x ];then
	echo "executable"
else
	echo "not executble"
fi
