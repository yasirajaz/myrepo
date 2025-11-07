def naive_string_matcher(str,ptr):
	n=len(str)
	m=len(ptr)
	for i in range(n-m+1):
		if ptr[0]==str[i]:
			j=1
			while j<m and ptr[j]==str[i+j]:
				j +=1
			if j==m:
				return i
	return -1
string="today is convocation of 2025 batch"
pattern="z"
result=naive_string_matcher(string,pattern)
if result>=0:
	print("pattern is found at index:",result)
else:
	print("pattern not found")
