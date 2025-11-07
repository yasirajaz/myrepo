def counting_sort(a,b,k):
	c=[]
	for i in range(0,k+1):
		c.append(0)
	for j in range(0,len(a)):
		c[a[j]] +=1
	for i in range(1,k+1):
		c[i] +=c[i-1];
	j=len(a)-1
	while j>=0:
		b[c[a[j]]-1]=a[j]
		c[a[j]] -= 1
		j -=1
	return b
list1=[3,2,4,5,2,4,1,0,5]
list2=list([0,0,0,0,0,0,0,0,0])
print(list1)
counting_sort(list1,list2,5)
print(list2)
