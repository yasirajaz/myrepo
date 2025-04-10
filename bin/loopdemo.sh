#!/bin/bash
IFS=$'-'
for college in sultan\'s college is better than "salman's"
do
	echo "$college is in lucknow"
done
list="integral	university-bbd-ramswaroop"
for college in $list
do
	echo "$college is in lucknow"
done
echo $college
for((i=0;i<6;i++)) # the argument in this loop is optional like in other language i.e we dont need i  if we dont want
do
	echo "hello"
done
echo $i
for((i=0;i<10;i++))
do
	if [ $i -eq 5 ]
	then
		continue # break bhi use kr skte to whi terminate ho jaega
	fi
	echo "$i"
done
