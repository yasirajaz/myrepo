x=int(input("enter first number: "))
y=int(input("enter second number: "))
try:
	result=x/y
except ZeroDivisionError: #we can give name or not , if there is multiple except then it has to give the name of the except
	print("second number cant be zero")
	y=int(input("enter second number again:"))
	result=x/y
	print(result)
else:
	print(result)
