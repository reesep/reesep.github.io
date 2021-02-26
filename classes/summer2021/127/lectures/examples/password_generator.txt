
# Write a program that will generate a random password for a user.
# The user should specify how long, n,  they want the password to be
# The password should be n characters long that is a random pattern of
# uppercase and lowercase letters

import random
import string

n = int(input("How long do you want the password to be? "))

characters = string.ascii_letters

password = ""
for i in range(n):
    

    r = random.randint(0,len(characters)-1)

    letter = characters[r]

    password += letter

print("Your password is",password)
    
