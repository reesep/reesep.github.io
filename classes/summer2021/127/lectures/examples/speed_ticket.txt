#The speeding ticket fine policy in Pearsallville is
#$50 plus $5 for each mph over the limit plus a penalty
#of $200 for any speed over 90 mph. Write a python function
# that accepts a speed limit and a clocked speed and either
# prints a message indicating the speed was legal or prints
# out the amount of the fine, if the speed was illegal



def determine_fine(speed_limit, clocked_speed):

    if(speed_limit < clocked_speed): #they need a fine
        fine = 50

        difference = clocked_speed - speed_limit
        fine += (difference * 5)

        if(clocked_speed > 90):
            fine += 200

        print("You broke the law! Your fine is",fine,"dollars")
        

        
    else: #they are good to go!
        print("No law was broken. You are fine!")





def main():

    speed_limit = float(input("Enter speed limit: "))
    clocked_speed = float(input("Enter clocked speed: "))

    determine_fine(speed_limit, clocked_speed)

main()

