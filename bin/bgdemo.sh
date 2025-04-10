#!/bin/bash
i=1
exec 3> tst.txt
while [ $i -lt 1000000000000000000 ]
do
	echo "this is iteration no: $i" >&3
	i=$[ i+1 ]
done
