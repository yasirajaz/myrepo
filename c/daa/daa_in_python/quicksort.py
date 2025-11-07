def partition(A,p,r):
	x=A[p]
	i=p
	j=r
	while i<j:
		while i<j and A[j]>x:
			j=j-1
		while i<j and A[i]<=x:
			i=i+1
		if i<j:
			A[i],A[j]=A[j],A[i]
	A[p],A[j]=A[j],A[p]
	return j
def quicksort(A,p,r):
	if p<r:
		q=partition(A,p,r)
		quicksort(A,p,q-1)
		quicksort(A,q+1,r)
arr = [5, 2, 9, 1, 5, 6]
print("Original array:", arr)
quicksort(arr,0,len(arr)-1)
print("Sorted array:", arr)
