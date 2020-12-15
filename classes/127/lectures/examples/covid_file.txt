
# Find the country and day that had the most new cases reported
# Prompt the user for a country code, then the function should provide
#   the total number of deaths reported from covid

def most_cases(filename):

    file = open(filename,"r")
    file.readline()

    country = ""
    day = ""
    month = ""
    year = ""

    largest_so_far = 0
    for each_line in file:
        row = each_line.split(",")

        row[3] = row[3].replace('"',"")

        if(int(row[3]) > largest_so_far):
            largest_so_far = int(row[3])
            country = row[5].replace("_"," ")
            day = row[0].replace('"',"")
            month = row[1].replace('"',"")
            year = row[2].replace('"',"")

    print("The country with the most daily new cases reported was on",month,day,year,"with",largest_so_far,"in the",country)

def deaths_by_code(filename):

    file = open(filename,"r")
    file.readline()

    code = input("Enter a country code: ")
    code = code.upper()

    country = ""
    total_deaths = 0
    for each_line in file:
        row = each_line.split(",")

        if code == row[-4].replace('"',""):
            country = row[5].replace("_"," ")
            row[4] = row[4].replace('"',"")
            total_deaths += int(row[4])


    print("There has been a total of",total_deaths,"deaths reported in",country,"from COVID-19")

        



deaths_by_code("covid.csv")
most_cases("covid.csv")
