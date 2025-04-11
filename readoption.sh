#!/bin/bash
read -n1 -p "[Y/N] to proceed:"
case $REPLY in
	Y|y)
		echo "your answer is yes"
		;;
	N|n)
		echo "your answer is no";;
	*)
		echo "wrong option";;
esac
