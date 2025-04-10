#!/bin/bash
s1="Lucknow"
s2="lucknow"
s3="Kanpur"
s4="kanpur"
if [ $s1 = $s2 ]
then
	echo "$s1 and $s2 are same"
else
	echo "$s1 and $s2 are not same"
fi
if [ $s1 != $s3 ]
then
	echo "$s1 is not same as $s3"
else
	echo "$s1 is same as $s3"
fi
if [ $s3 = $s4 ]
then
	echo "$s1 and $s2 are same"
else
	echo "not same"
fi
