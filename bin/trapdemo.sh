#!/bin/bash
trap "echo 'Signal is trapped' " SIGINT
count=1
while [ $count -lt 10 ]
do
	echo "$count"
	sleep 2
	count=$[ count+1 ]
	if [ $count -eq 5 ]
	then
		trap -- SIGINT #"echo 'new signal #we can use - or --
	fi
done
