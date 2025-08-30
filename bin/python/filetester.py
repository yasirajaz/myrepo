with open('sample.txt','r') as file_obj:
	datalist = [data.strip() for data in file_obj]
	print(datalist)
