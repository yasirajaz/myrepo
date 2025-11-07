def rabin_karp_matcher(T,P,q):
	n=len(T)
	m=len(P)
	p=0
	t=0
	h= pow(256, m - 1, q)
	for i in range(m):
		p=(256 * p+ord(P[i]))%q
		t=(256 * t+ord(T[i]))%q
	for s in range(n - m + 1):
		if p == t:
			if T[s:s + m] == P:
				print("pattern occured at shift ",s)
		if s < n - m:
			t = (256 * (t - ord(T[s]) * h) + ord(T[s+m])) % q
a="abcdaadasdadsdfsnjfnvvfjf"
b="nvv"
q=101
rabin_karp_matcher(a,b,q)
