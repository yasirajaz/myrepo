name=["yasir","amir","zoheb","hozaifa","abubakar"]
for names in name:
	print(names)
#sorting has two methods 
#sort is method which is depend on the class
name.sort()  #to sort in ascending order which is permanent
print(name)
name.sort(reverse=True) #descending and also a permanent
print(name)
namelist=sorted(name,reverse=True) #secont type is function which temporary
print(namelist)
print(name) #this will give permanent last sorted list


#we can insert any element to corresponding index
name.insert(1,"arbaz")
print(name)

#to delte any element
#del name[1]
#print(name)

name.pop() #to remove last elemment
name.pop(1)
print(name)

name.remove("hozaifa")
print(name)
