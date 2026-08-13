def frequency(s):
    freq={}
    for i in s:
        if i in freq:
            freq[i]=freq[i]+1
        elif i!=" ":
            freq[i]=1
    return freq
print(frequency("lucknow junction"))

