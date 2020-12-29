


class Billionaire():

    def __init__(self,name,company,age,gender,worth,location):
        self.name = name
        self.company = company
        self.age = age
        self.gender = gender
        self.worth = worth
        self.location = location

    def getWorth(self):
        return self.worth

    def getGender(self):
        return self.gender

    def getLocation(self):
        return self.location

    def __str__(self):
        answer = ""
        answer += self.name + "  Worth: " + str(self.worth)

        return answer





def fill_billionaires_list(filename):

    bl = []
    file = open(filename,"r")

    file.readline()
    for each_line in file:
        row = each_line.split(",")

        name = row[0]
        company_name = row[4]
        age = int(row[-14])
        gender = row[-13]
        worth = float(row[-7])
        location = row[-9]

        bl.append(Billionaire(name,company_name,age,gender,worth,location))


    return bl
        

def searchByMoney(billionaires_list):
    threshold = float(input("Enter value in billions: "))

    for each_bil in billionaires_list:
        worth = each_bil.getWorth()

        if worth >= threshold:
            print(each_bil)

def bilByGender(billionaires_list):
    men = 0
    women = 0
    unknown = 0

    for each_bil in billionaires_list:

        if each_bil.getGender() == "male":
            men += 1
        elif each_bil.getGender() == "female":
            women += 1
        else:
            unknown += 1

    print("Number of Male vs Female Billionaires")
    print("-------------------------------------")
    print("Number of Male Billionaires:",men)
    print("Number of Female Billionaires:",women)
    print("Unknown:",unknown)
            

def bilByContinent(billionaires_list):

    continent = {}
    for each_bil in billionaires_list:

        location = each_bil.getLocation()
        if  location not in continent:
            continent[location] = 1
        else:
            continent[location] += 1

    #remove stray key-value pair
    del continent['0']
    
    
    for key,value in continent.items():
        print("Number of billionaires in "+key+":",value)
        



def main():

    billionaires_list = fill_billionaires_list("billionaires.csv")

    searchByMoney(billionaires_list)
    print("")

    bilByGender(billionaires_list)
    print("")

    bilByContinent(billionaires_list)
    print("")



main()
