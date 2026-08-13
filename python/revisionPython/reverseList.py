def reverse(list):
    i=0
    j=len(list)-1
    while i<j:
        list[i],list[j]=list[j],list[i]
        i=i+1
        j=j-1
    else:
        print("condition not met")
L=[2,3,4,5,6,7,8,99]

print("original list",L)
reverse(L)
print("reversed list",L)