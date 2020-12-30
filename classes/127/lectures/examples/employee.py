

class Employee():

    def __init__(self,name,salary,empID):
        self.name = name
        self.salary = salary
        self.empID = empID

    def getName(self):
        return self.name
    
    def getSalary(self):
        return self.salary

    def getEmpID(self):
        return self.empID

    def __str__(self):
        answer = "My name is " + self.name
        answer += " and I am a Employee"
        return answer



class Accountant(Employee):

    def __init__(self,name,salary,empID,cpaID):
        Employee.__init__(self,name,salary,empID)
        self.cpaID = cpaID

    def getCpaID(self):
        return self.cpaID

    def __str__(self):
        answer = "My name is " + self.name
        answer += " and I am an accountant"
        return answer

class SoftwareEngineer(Employee):

    def __init__(self,name,salary,empID,language):
        Employee.__init__(self,name,salary,empID)
        self.languge = language

    def getLanguage(self):
        return self.language


    def __str__(self):
        answer = "My name is " + self.name
        answer += " and I am an Software Engineer"
        return answer

class Lawyer(Employee):

    def __init__(self,name,salary,empID,years_practicing):
        #another way to call the parent class
        super().__init__(name,salary,empID)
        self.years_practicing = years_practicing

    def getYearsPracticing(self):
        return self.years_practicing

    def __str__(self):
        answer = "My name is " + self.name
        answer += " and I am an Lawyer"
        return answer
        
class SoftwareEngineerIntern(SoftwareEngineer):

    def __init__(self,name,salary,empID,language,school):
        super().__init__(name,salary,empID,language)
        self.school = school

    def getSchool(self):
        return self.school

    def __str__(self):
        answer = "My name is " + self.name
        answer += " and I am an Software Enginner and an Intern"
        return answer


emp = Accountant("Kevin Malone", 40000, 123, 789)
print(emp)

emp2 = SoftwareEngineer("Reese Pearsall", 75000, 456, "Python")
print(emp2)

emp3 = Lawyer("Bob Smith",100000,555,12)
print(emp3)


emp4 = SoftwareEngineerIntern("Sally Smith",10000,468,"Matlab","Montana State")
print(emp4.getName())





