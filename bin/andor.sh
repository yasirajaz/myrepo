#!/bin/bash
x=10
y=20
z=30
if [ $x -lt $y ] && [ $y -lt $z ];then
	echo "$x is less than $y and $y is less than $z"
else
	echo "not true"
fi
if [[ ++x < ++y ]] || [[ ++y < ++z ]]
then
	echo "$x true"
else
	echo "false"
fi
