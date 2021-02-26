###reese pearsall
##
## QUESTION 2

##def calculate_trip_cost(family_members, nights):
##
##    answer = (440 * family_members) + (185 * nights) + (100 * family_members) + 20
##    
##
##    return answer
##
##
##
### Your function will go above this comment. You should not modify anything below.
##family_members = int(input("How many family members are going to Disneyworld? "))
##nights = int(input("How many nights are you staying in the hotel? "))
##answer = calculate_trip_cost(family_members, nights)
##print("The total cost of the trip is $", answer)


## QUESTION 3

##month = input("Enter a month: ").lower()
##date = int(input("Enter a date: "))
##
##
##if month == "june":
##    if date >= 20:
##        print("It is summer!")
##    else:
##        print("It is not summer")
##    
##elif month == "july":
##    print("It is summer!")
##
##elif month == "august":
##    print("It is summer!")
##
##elif month == "september":
##    if date <= 22:
##        print("It is summer!")
##    else:
##        print("It is not summer")
##else:
##    print("It is not summer")

## QUESTION 4


def calculate_profit(days):

    total = 0
    counter = 1
    for day in days:

        profit = day[0] - day[1]

        print("Day",counter,"proft: $" + str(profit))
        counter += 1

        total += profit
    print("Total Profit: $" + str(total))



# [[day1-revenue, day1-expenses], [day2-revenue, day2-expenses], etc]
days = [[31,10], [60,23], [42,12], [66, 30], [100, 15]]
calculate_profit(days)



























    


























