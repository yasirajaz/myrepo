#!/bin/bash
#function myfn(){
#	ls;
#}

#myfn
function myfn(){
	#read -p "enter a number:" data
	#echo $[ $data*5 ] #return $[ $data*5 ] this is for return between 0-255
	echo $[ $1*$2 ]
}
ab=$(myfn 10 20)
echo "$ab"
