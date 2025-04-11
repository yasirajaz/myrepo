#!/bin/bash
function myfunction(){
	x=10
	local y=20
	echo "x=$x and y=$y"
}
myfunction
echo " x = $x"
echo "y = $y"
