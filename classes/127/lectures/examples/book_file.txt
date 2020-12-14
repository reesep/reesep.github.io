
# Write a function that will
# Find the book that has the most sentences
# Given a year, tell how many books were published in that year
# Given an author, tell how many books they published


def books_by_author(first_name, last_name):

    file = open("classics.csv","r")
    file.readline()
    #lastname; first
    name = last_name +"; " + first_name
    
    counter = 0 
    for each_line in file:
        row = each_line.split(",")
        if(row[11] == name):
            print("They wrote",row[3])
            counter += 1


    print(first_name,last_name,"wrote",counter,"books")
    file.close()


def publish_year(year):
    file = open("classics.csv","r")
    file.readline()
    counter = 0
    for each_line in file:
        row = each_line.split(",")

        if(int(row[16]) == year):
            counter +=1
            

    print("In the year",year,"there were",counter,"books published")
    file.close()

        

def most_sentences():
    file = open("classics.csv","r")
    file.readline()

    largest_so_far = 0
    book_name = ""
    
    for each_line in file:
        row = each_line.split(",")

        if( int(row[-3]) > largest_so_far):
            largest_so_far = int(row[-3])
            book_name = row[3]

    print("The book with most sentences is",book_name)
    file.close()
        


books_by_author("William","Shakespeare")
publish_year(1995)        
most_sentences()

