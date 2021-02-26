
# using grocery_list.txt, we are going to find the
# total cost of the grocery list


file = open("grocery_list.txt","r")
file.readline()
total = 0
for each_line in file:
    row = each_line.split(" ")
    row[3] = row[3].strip()
    total += (int(row[1]) * float(row[2]))

    

print("The total cost is:",total)
file.close()


    
        

