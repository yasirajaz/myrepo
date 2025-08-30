filename=input("enter filename to be read:")
try:
	with open(filename,'r') as file_obj:
		for data in file_obj.readlines():
			print(data.rstrip())
except FileNotFoundError:
	print("the given file doesnt exist")
finally:
	print('finally block executed')
#finally will always excute rather if exception occur or not
