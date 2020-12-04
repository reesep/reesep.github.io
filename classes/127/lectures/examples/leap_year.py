
# Write a function that takes a year as a parameter
# and returns True if the year is a leap year.
# Return False otherwise


def is_leap_year(year):

    # Divisible by 4?
    if( year % 4) == 0:
        # Divisible by 100?
        if( year % 100) == 0:
            # Divisible by 400?
            if( year % 400) == 0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False
                





def main():

    year = 2020

    print(is_leap_year(year))


main()
    
