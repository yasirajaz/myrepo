name=["amit","sumit","ajay","vijay","mukesh","ramesh"]
subname=name[1:4] #from 1 till 3
print(subname)
subname2=name[2:] #from 2 till last
print(subname2)
subname3=name[:3] #from 0 till 2
print(subname3)
subname4=name[-2:] #from second last till last
print(subname4)
subname5=name[:-1]
print(subname5)
print(name)

#copying list
copyname=name[:] #if [:] is not written then mohit nad sohit willbe append in same line bcz it doesnt copying but point the name list
name.append("mohit")
copyname.append("sohit")
print(name)
print(copyname)
