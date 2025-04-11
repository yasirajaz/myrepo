#!/bin/bash
if ls -d abc
then
	echo "abc directory found"
elif ls -d bbc
then
	echo "bbc directory found"

else
	echo "no dir found"
fi
