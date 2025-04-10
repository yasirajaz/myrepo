#!/bin/bash

for((a=1;a<=5;a++))
do
	for((b=5;b>=1;b--))
	do
		if [ $b -gt $a ];then
			echo -n "  "
		else
			echo -n "* "
		fi
	done
	echo
done
for((i=1;i<=5;i++))
do
	for((j=1;j<=5;j++))
	do
		if [[ $i -eq 1 || $i -eq 5 || $j -eq 1 || $j -eq 5 ]]
		then
			echo -n "* "
		else
			echo -n "  "
		fi
	done
	echo
done
for((i=0;i<5;i++))
do
	for((j=i;j<5;j++))
	do
		echo -n "  "
	done
	for((j=1;j<=(2*i-1);j++))
	do
		echo -n "* "
	done
	echo
done
for((i=0;i<5;i++))
do
	for((j=0;j<5;j++))
	do
		if [[ $i -eq $j ]]
		then
			echo -n "* "
		else
			echo -n "  "
		fi
	done
	echo
done
for((i=0;i<5;i++))
do
	for((j=0;j<5;j++))
	do
		if [[ $j -eq 4-$i || $i -eq $j ]]
		then
			echo -n "* "
		else 
			echo -n "  "
		fi
	done
	echo
done
