class MyClass:
	def __init__ (self,name,age):
		self.name=name
		self.age=age
		self.salary=89000 # we can assign new argument without assigning 
		print("constructor called")
	def printer(self):
		print(f"name:{self.name} age:{self.age} salary:{self.salary}")
m=MyClass('manoj kumar',30)
print(m.name)
print(m.age)
print(m.salary)
m.printer()

m2=MyClass('amir ajaz',19)
m2.salary=14000
m2.printer()
m.age=40 #updating m age to 40
m.printer()
