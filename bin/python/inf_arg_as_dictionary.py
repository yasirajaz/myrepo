def information(firstname,lastname,**kargs):
	dict={'firstname':firstname,'lastname':lastname}
	for k,v in kargs.items():
		dict[k]=v
	return dict
result=information('yasir','ajaz',age=21,city='lucknow')
print(result)
