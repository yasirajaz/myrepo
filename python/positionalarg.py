def max(a,b,c):
	if a>=b:
		if a>=c:
			return a
		else:
			return c
	elif b>=c:
		return b
	else:
		return c
x=input("enter first number: ")
y=input("enter second number: ")
z=input("enter third number: ")
maxvalue=max(x,y,z)
print(f'max valuse is {maxvalue}')
