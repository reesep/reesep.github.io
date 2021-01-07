
## Code from Review Session 1/7/21
###### QUESTION 2
def calculate_diagonal(matrix):

    num = len(matrix) ** .5
    

    total = 0
    for i in range(1,int(num+1)):
        total += matrix[(i,i)]


    return total


## Your function should go above this line. Do not change anything below

matrix = {(1,1): 5, (1,2): 8, (1,3): 2,
          (2,1): 3, (2,2): 7, (2,3): 9,
          (3,1): 1, (3,2): 4, (3,3): 3 }


answer = calculate_diagonal(matrix)
print("The diagonal of the matrix is",answer)


###### QUESTION 3
class Movie():
    
    def __init__(self, name, year):
        self.name = name
        self.year = year
        self.cast = []

    def add_cast_member(self,new_member):
        self.cast.append(new_member)

    def set_year(self, new_year):
        self.year = new_year

    def __str__(self):
        answer = ""
        answer += "Movie Name: " + self.name + "\n"
        answer += "Release Year: " + str(self.year) + "\n"
        answer += "List of Cast Members" + "\n"
        answer += "--------------------" + "\n"
        counter = 1
        for x in self.cast:
            answer += str(counter) + ". " + x + "\n"
            counter += 1


        return answer



## Your code should go above this line. Do not change anything below
def main():
 starwars = Movie("Star Wars", 1970)
 starwars.add_cast_member("Mark Hamill")
 starwars.add_cast_member("Carrie Fisher")
 starwars.add_cast_member("James Earl Jones")
 starwars.set_year(1977)
 print(starwars)
 indy = Movie("Raiders of the Lost Ark",1981)
 indy.add_cast_member("Harrison Ford")
 print(indy)
main()

######## QUESTION 4
import numpy as np
### -------------------------------


## Updated solution. I got it figured out
class Course_Schedule():

    def __init__(self,size):
        self.courses = np.ndarray(size, dtype=Course)
        self.index = 0

    def add(self,course):
        self.courses[self.index] = course
        self.index += 1

    def __str__(self):
        answer = ""
        answer += "My Schedule" + "\n"
        answer += "----------------" + "\n"
        ## I was doing something wrong in this for loop before
        for x in range(self.courses.size):
            answer += str(self.courses[x]) + "\n"
        
        return answer

class Course():

    def __init__(self,name,number):
        self.name = name
        self.number = number

    def __str__(self):
        return self.name + " " + str(self.number)


# Your code will go here. Do not change anything below
# -------------------------------
def main():
 my_courses = Course_Schedule(3)
 course_1 = Course("CSCI", 127)
 my_courses.add(course_1)
 course_2 = Course("M", 171)
 my_courses.add(course_2)
 course_3 = Course("WRIT", 101)
 my_courses.add(course_3)
 print(my_courses)
# -------------------------------
main()

##### QUESTION 5

import numpy as np # Do not import anything else
import matplotlib.pyplot as plt
units = ["CS", "ChBE", "Civil", "M&IE", "General", "CpE"] # See question 1 for a
enrollments = [552, 563, 731, 1463, 210, 410] # See question 1 for a description
# Write the missing statements below this comment
e = [.02, .02, .02, .02, .02, .02]
plt.figure("COE Enrollment Visualization")
plt.title("Pie Chart of COE Enrollments")
plt.pie(enrollments,colors=["blue","gold"],explode=e,labels=units,counterclock=False)
plt.show()




















