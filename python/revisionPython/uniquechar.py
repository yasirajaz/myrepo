def uniquechar(s):
    mySet=set()
    for i in range(0,len(s)):
        if s[i]==' ':
            continue
        mySet.add(s[i])
    print(len(mySet))
s=("Lucknow Junction")
uniquechar(s)
