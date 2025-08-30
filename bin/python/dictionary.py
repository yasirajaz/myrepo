student={ 'name':"manoj",'age':21,
	"college":'iul',
	"dob":31,
	'salary':22
}
print(student['name'])
print(student['age'])
student['age']=22 #update age
print(student['age'])
#add new element or key
student['city']='lucknow'
print(student)

#delete key
del student['dob']
print(student)


#loop in dictionary
for key,value in student.items():
	print(f'key is {key} and value is {value}')

#to get all using only keys
for v in student.values():
	print(f'value is {v}')
for k in student.keys(): #its not necessary student.key() we can write only student
	print(f'key is {k} and value is {student[k]}')

#format of keys and values
print(student.keys())
print(student.values())
# convert dictionary into set(set doesnt contain any duplicate values)
for value in student.values():
	print(value)
for value in set(student.values()):
	print(value)
