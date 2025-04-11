#!/bin/bash
. calfun.sh #source command will also be used
value1=10
value2=5
result1=$(add $value1 $value2)
result2=$(mul $value1 $value2)
result3=$(div $value1 $value2)
echo "$result1"
echo "$result2"
echo "$result3"
