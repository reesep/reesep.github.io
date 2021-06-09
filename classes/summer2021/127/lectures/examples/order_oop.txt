


class Order():

    def __init__(self,name,price):
        self.name = name
        self.price = price



    def __str__(self):
        return self.name + ": " + str(self.price)

    # for the + operator
    def __add__(obj1, obj2):
        return obj1.price + obj2.price
    
    # for the - operator
    def __sub__(obj1, obj2):
        return obj1.price - obj2.price

    # for the * operator
    def __mul__(obj1, obj2):
        return obj1.price * obj2.price


food_order = Order("McDonalds",10.99)
drink_order = Order("Starbucks",5.50)

print(food_order)

total = food_order + drink_order
total = food_order - drink_order
total = food_order * drink_order
print(total)
