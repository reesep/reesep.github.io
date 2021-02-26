
# Write a program that will ask the user for their
# name, and then put the name in a box

# +-----------------+
# |Reese Pearsall   |
# +-----------------+


name = input("Enter your name (under 25 characters): ")

print("+-------------------------+")
print("|{:^25}|".format(name))
print("+-------------------------+")


