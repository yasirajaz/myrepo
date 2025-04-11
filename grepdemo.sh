#!/bin/bash
if grep ubuntu /etc/paswd/
then
	echo "user found"
else
	echo "usr not found"
fi
