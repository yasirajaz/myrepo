from name import formatted_name
print('enter q to terminate')
while True:
	first=input('enter first name:')
	if first=='q':
		break
	last= input('enter second name')
	if last =='q':
		break
	fname=formatted_name(first,last)
	print(fname)
