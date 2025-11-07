def counting_sort(a,n,pos):
	n = len(a)
	b=[0]*n
	c=[0]*10
	for i in range(n):
		q=a[i]
		for j in range(1,pos+1):
			p = q%10
			q=q//10
		c[p] += 1
	for i in range(1,10):
		c[i] += c[i - 1]

	for j in range(len(a) - 1, -1, -1):
		p = 0
		q = a[j]
		for k in range(1,pos+1):
			p = q % 10
			q = q //10
		b[c[p]-1] = a[j]
		c[p] -= 1
	for i in range(n):
		a[i] = b[i]

def radix_sort(a):
	max_num = max(a)
	k=1
	length = len(a)
	numlen = 0
	while max_num!= 0:
		numlen += 1
		max_num=max_num//10
	for i in range(1, numlen + 1):
		counting_sort(a,length,i)

a = [170, 45, 75, 90, 802, 24, 2, 66]
print("Before sorting:", a)
radix_sort(a)
print("After sorting:", a)
