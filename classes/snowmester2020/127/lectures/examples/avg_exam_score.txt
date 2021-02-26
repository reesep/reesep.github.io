
# Write a function that takes in 3 exam scores and returns
# the average of the exam scores


def avg_scores(e1,e2,e3):
    answer = (e1 + e2 + e3) / 3
    return answer



def main():
    
    exam1 = float(input("Enter exam score 1: "))
    exam2 = float(input("Enter exam score 2: "))
    exam3 = float(input("Enter exam score 3: "))

    avg = avg_scores(exam1,exam2,exam3)

    print("The average is {:.2f}".format(avg))

main()


