employee={'name':'manoj','age':20,'address':{'house':138,'city':'lucknow'},'marks':[81,91,71]}
for key,value in employee.items():
	print(f'key is {key} and value is {value}')
# to avoid error that iif key doesnt exist

print(employee.get('city','not found'))
