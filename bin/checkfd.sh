#!/bin/bash
exec 3>testfile1
exec 7< testfile2
lsof -a -p $$ -d 0,1,2,3,7
