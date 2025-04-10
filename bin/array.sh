#!/bin/bash
array=("apple" "banana" "grapes" "cherry" "pomegranete" "mango")
echo "first element: ${array[0]}"
echo "all elements: ${array[@]}"

echo "length of array: ${#array[@]}"
array+=("dates")
echo "final array: ${array[@]}"

unset array[3]
echo "after removing element 3:${array[@]}"

echo "looping through array:"
for item in "${array[@]}"
do
	echo "$item"
done

sortedarr=($(printf "%s\n" "${array[@]}" | sort ))
echo "sorted array: ${sortedarr[@]}"
