skills={'kaif':['c'],'saif':['c','python'],'aurijit':['c','python','java']}
for key,value in skills.items():
	print(f'{key}')
	for language in value:
		print(f"\t{language}")
