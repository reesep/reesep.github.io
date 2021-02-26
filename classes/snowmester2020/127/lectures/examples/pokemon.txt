

class Pokedex():

    def __init__(self):
        self.pokedex = []

    def addToPokdex(self,newPokemon):
        self.pokedex.append(newPokemon)


    def searchForPokemonByType(self,search_type):

        print("List of pokemon that are",search_type,"type")
        for each_mon in self.pokedex:
            if each_mon.getType() == search_type:
                print(each_mon)
                
        
    
    def __str__(self):

        answer = ""
        print("The Pokedex")
        print("-----------")
        for each_mon in self.pokedex:
            answer += each_mon.getName() + "\n"
        return answer


class Pokemon():

    def __init__(self,name,number,type,cp):
        self.name = name
        self.number = number
        self.type = type
        self.cp = cp


    def getName(self):
        return self.name
    def getNumber(self):
        return self.number
    def getType(self):
        return self.type
    def getCP(self):
        return self.cp

    def __str__(self):
        answer = ""
        answer += str(self.number) + " " + self.name + "\n"
        answer += "Type: " + self.type + "\n"
        answer += "CP: " + str(self.cp)

        return answer
        





def battle_pokemon(p1, p2):
    if p1.getCP() > p2.getCP():
        print(p1.getName(),"is the winner")
    elif p1.getCP() < p2.getCP():
        print(p2.getName(), "is the winner")
    else:
        print("it is a tie!")



def main():

    pokedex = Pokedex()

    pokemon1 = Pokemon("Pikachu",25,"Electric",320)
    pokedex.addToPokdex(pokemon1)

    
    pokemon2 = Pokemon("Charmander",4,"Fire",309)
    pokedex.addToPokdex(pokemon2)
    
    pokemon3 = Pokemon("Squirtle",7,"Water",314)
    pokedex.addToPokdex(pokemon3)
    
    pokemon4 = Pokemon("Nidoking",34,"Poison",505)
    pokedex.addToPokdex(pokemon4)

    pokemon5 = Pokemon("Vulpix",37,"Fire",299)
    pokedex.addToPokdex(pokemon5)

    pokemon6 = Pokemon("Diglett",50,"Ground",265)
    pokedex.addToPokdex(pokemon6)

    print(pokedex)

    choice = input("Enter a type of pokemon to search for: ")
    pokedex.searchForPokemonByType(choice)

    #battle_pokemon(pokemon1,pokemon2)
    #battle_pokemon(pokemon4,pokemon2)



main()
