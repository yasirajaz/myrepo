def add (*args): # (x,*args) we can pass any number of argument from 0 to infinite
# it is form of list
	#sum=x 
	#for a in args:
	#	sum=sum+a
	#return sum
	return sum(args)
result=add(1,2,3,28197,1266)
print(result)
result=add(2)
print(result)
