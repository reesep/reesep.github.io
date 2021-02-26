class Date:
    def __init__(self, month, day, year):
        self.month = month
        self.day = day
        self.year = year

    def __str__(self):
        return str(self.month) + "/" + str(self.day) + "/" + str(self.year)

# -----------------------------------------------------------

championship = Game("Montana State", 62, "Idaho State", 56, Date(3, 11, 2017))
print(championship)

ncaa = Game("Montana State", 63, "Washington", 91, Date(3, 18, 2018))
print(ncaa)