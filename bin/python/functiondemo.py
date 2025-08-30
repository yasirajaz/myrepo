def sumarray(x):
	s=0
	for data in x:
		s=s+data
	return s
salaries=[100,200,555,666,566]
result=sumarray(salaries) #we can use as substring by slicing salaries[1:4]
print(f"sum of the salaries is {result}")
