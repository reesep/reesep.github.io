

f = open("pirate.csv","r")

out = []
for each_line in f:

    split = each_line.split(",")

    split.reverse()

    out.append(split)


fo = open("pirate.csv","w")


for each in out:
    fo.write(",".join(each) + "\n")

fo.close()

