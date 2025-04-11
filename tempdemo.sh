#!/bin/bash
tempfile=$(mktemp -t tmp.XXXXXX)
echo "this is first line" | tee $tempfile #>$tempfile
echo "this is second line" | tee -a $tempfile  #>>$tempfile
echo "location: $tempfile"
cat $tempfile
