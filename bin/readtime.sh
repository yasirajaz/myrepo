#!/bin/bash
if read -s -t 5 -p "enter pasword:" pass
then
	echo "your password is $pass"
else
	echo "you should enter the pass within 5 seconds"
fi
