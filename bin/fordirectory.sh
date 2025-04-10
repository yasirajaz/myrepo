#!/bin/bash
directory=0
files=0
for file in /home/ubuntu/bin/*
do
	if [ -d $file ]
	then
		directory=$[ directory + 1 ]
	else
		files=$[ files + 1 ]
	fi
done
echo "files: $files"
echo "directory: $directory"
