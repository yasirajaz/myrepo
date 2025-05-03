def list_modifier(vector):
	i=0
	while i< len(vector):
		vector[i]= vector[i] * vector[i]
		i=i+1
data=[2,3,4,5]
list_modifier(data) #if we pass (data[:]) then only original list you will get as output
print(data)
