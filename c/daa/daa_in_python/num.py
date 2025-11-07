print("Enter marks obtained in 5subjects (out of 100)")
marks1 =int(input("Enter marks: "))
marks2 =int(input("Enter marks:"))
marks3 =int(input("Enter marks:"))
marks4 =int(input("Enter marks:"))
marks5 =int(input("Enter marks:"))
average = ( marks1 + marks2 + marks3 + marks4 + marks5 )/5
if average>90 and average<=100:
	print("Your Grade is A+")
elif average>80 and average<=90:
	print("Your Grade is A")
elif average>70 and average<=80:
	print("Your Grade is B+")
elif average>60 and average<=70:
	print("Your Grade is B")
elif average>0 and average<=60:
	print("Your Grade is F")
else:
	print("end")
