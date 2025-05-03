def name_printer(firstname,lastname): #we can pass lastname=khan then we dont need to write lastname or pass argument fo lastname
	name=firstname+' '+lastname
	print(f'{name}')
name_printer(firstname="yasir",lastname="ajaz") #if we pass argument that is already given in the function then it will uodate to the passsed argument
name_printer(lastname="jafri",firstname="zaid")
