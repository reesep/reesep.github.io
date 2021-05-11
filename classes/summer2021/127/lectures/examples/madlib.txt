
# Write a program that creates a madlib story. The program
# should ask for a certain number and type of word (noun/
# adjectives/verbs/etc). After collecting all the inputs
# then the story will be printed for the user.


# Asks user for words to fill in madlib
adj1 = input("Enter an adjective: ")
name = input("Enter a hero name: ")
number = input("Enter a number: ")
name2 = input("Enter a villain name: ")
town = input("Enter a name of a town: ")
town2 = input("Enter another name of a town: ")
adj2 = input("Enter an adjective: ")

# print out story
print("A new and",adj1,"movie is coming soon to a theatre near you.")
print("Its about",name,"and the",number,"of python programmers.")
print(name,"is a computing wizard whose talent threatens",name2 +".")
print(name,"is forced to flee from",town,"and hides in nearby",town2 +".")
print("but",name2,"finds",name,"and casts a",adj2,"spell.")
