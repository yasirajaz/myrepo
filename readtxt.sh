#!/bin/bash
cat read.txt | while read data
do
	echo "$data"
done
