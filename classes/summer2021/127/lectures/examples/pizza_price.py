

# Write a program that will calculate the cost per square inch of a
# circular pizza, given its diameter (inches) and price.

diameter = float(input("Enter diameter of pizza: "))
price = float(input("Enter price of pizza: "))

area = (3.14159) * (diameter / 2) ** 2

ppsi = price / area


print("The price per square inch is:" + str(ppsi))

