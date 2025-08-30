#!/bin/bash
x=1
while [ $x -le 10 ]
do
	echo "hello"
	sleep 1
	x=$[ $x + 1 ]
done
