

class Fraction():


    def __init__(self,n,d):
        self.numerator = n
        self.denominator = d



    def __str__(self):
        answer = str(self.numerator) + "/" + str(self.denominator)
        return answer

    def simplify(self):
        """ Use Euclid's algorithm to simplify fraction via gcd """
        m = self.numerator
        n = self.denominator

        while m % n != 0:
            old_m = m
            old_n = n
            m = old_n
            n = old_m % old_n

        self.numerator = self.numerator // n
        self.denominator = self.denominator // n

    def __add__(self,other):

        new_num = self.numerator * other.denominator + other.numerator * self.denominator
        new_den = self.denominator * other.denominator

        new_frac = Fraction(new_num, new_den)

        new_frac.simplify()
        return new_frac







num = int(input("Enter a numerator: "))
den = int(input("Enter a denominator: "))

fraction1 = Fraction(num,den)




num = int(input("Enter a numerator: "))
den = int(input("Enter a denominator: "))

fraction2 = Fraction(num,den)


print(fraction1)
print(fraction2)
print(fraction1 + fraction2)







