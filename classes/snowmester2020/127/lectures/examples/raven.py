

# dict = { each-word: frequency-of-word
#            }


file = open("raven.txt","r")
freq = {}
for each_line in file:
    words = each_line.split(" ")

    for word in words:

        word = word.lower()

        word = word.strip()
        word = word.replace("-","")
        word = word.replace("!","")
        word = word.replace(":","")
        word = word.replace(".","")
        word = word.replace('"',"")

        if word not in freq:
            freq[word] = 1
        else:
            freq[word] += 1

del freq[""]
print(freq)
print(sorted(freq.items(), key=lambda x:x[1],reverse =True))
    
