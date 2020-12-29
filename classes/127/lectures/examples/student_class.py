
class Student():

    #all students have a name, major, GPA, ID, Year
    def __init__(self,name,major,student_id,gpa="Undefined",year="Freshman"):
        self.name = name
        self.major = major
        self.student_id = student_id
        self.gpa = gpa
        self.year = year
        self.champ_change = 0
        self.minor = "N/A"

   
    #reader methods (getters)
    def getName(self):
        return self.name

    def getMajor(self):
        return self.major

    def getGpa(self):
        return self.gpa

    def getYear(self):
        return self.year

    #writer methods (setters)
    def setMajor(self,newMajor):
        self.major = newMajor

    def setYear(self,newYear):
        self.year = newYear

    def setMinor(self,newMinor):
        self.minor = newMinor

    def calculateYearsLeft(self):

        if self.year == "Freshman":
            print(self.name,"has 3 years left")
        elif self.year == "Sophomore":
            print(self.name,"has 2 years left")
        elif self.year == "Junior":
            print(self.name,"has 1 years left")
        elif self.year == "Senior":
            print(self.name,"has less than a year left")
        else:
            print(self.name,"has ????? years left")


##    def __str__(self):
##
##        answer = "Name: " + self.name + "\n"
##        answer += "Major: " + self.major + "\n"
##        answer += "GPA: " + str(self.gpa) + "\n"
##        answer += "Student ID: " + self.student_id + "\n"
##        answer += "Year: " + self.year + "\n"
##        answer += "Minor: " + self.minor + "\n"
##        answer += "Champ Change: " + str(self.champ_change)
##                  
##        
##        return answer




def main():

    #create a student
    newstudent = Student("Sam","Biology","42141241")
    student1 = Student("James","Computer Science","04293401",4.0,"Junior")
    student2 = Student("Sally","Math","41982641901",3.6,"Sophomore")

    print(newstudent)


main()
