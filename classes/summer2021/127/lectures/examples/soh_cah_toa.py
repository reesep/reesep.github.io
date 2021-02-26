
import math



degree = float(input("Enter an angle in degrees: "))


option = input("Sine, cosine, tangent? ")



if(option.lower() == "sine"):
    radians = math.radians(degree)
    answer = math.sin(radians)
    print(answer)

if(option.lower() == "cosine"):
    radians = math.radians(degree)
    answer = math.cos(radians)
    print(answer)

if(option.lower() == "tangent"):
    radians = math.radians(degree)
    answer = math.tan(radians)
    print(answer)
