#!/bin/bash
exec 0<yasir.txt
exec 3>yas.txt
while read line
do
	echo "Line ${i}: ${line}" >&3 
	i=$[ i+1 ]
done
