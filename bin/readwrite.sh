#!/bin/bash
exec 3<> testfile #reading and writing to testfile using file descriptor 3
read line <&3
echo "Read: $line"
echo "this is a test line" >&3
