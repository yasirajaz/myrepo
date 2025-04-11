#!/bin/bash
exec 3> testfile
echo "this is a test line" >&3
exec 3>&-
echo "this is another line" >&3
