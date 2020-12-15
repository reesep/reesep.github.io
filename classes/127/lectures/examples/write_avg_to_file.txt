
# Reads from a file with exam scores and write the average
# to an file, averages.txt


file = open("scores.txt","r")
out_file = open("averages.txt","w")

for each_line in file:
    row = each_line.split(" ")
    row[-1] = row[-1].strip()
    
    name = row[0]

    grades = row[1:]
    s = 0
    for grade in grades:
        s += float(grade)

    
    avg = s / len(grades)


    out_file.write(name + " has an average of " + str(avg) + "\n")


file.close()
out_file.close()
    
    

    
