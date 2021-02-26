


def read_from_file(filename):

    file = open(filename,"r")

    scores = []

    for each_line in file:
        row = each_line.split(" ")

        entry = [int(row[0]),row[1].strip()]

        scores.append(entry)


    

    file.close()
    return scores

def write_to_file(scores,filename):

    file = open(filename,"w")

    top10 = scores[0:10]
    for score in top10:
        file.write(str(score[0]) + " " + score[1] + "\n")

    file.close()

def main():
    
    # read from our file into some list
    # [ [999, Tom], [740, Wes] ... ]

    scores = read_from_file("arcade_scores.txt")

    for i in scores:
        print(i)
    
    #ask user for a new score/name
    new_score = int(input("Enter a new score: "))
    new_name = input("Enter a new name: ")

    if(new_score > scores[0][0]):
        print("Congratulations.. New high score!")

    #insert that score where it belongs in the list
    new_entry = [new_score,new_name]

    scores.append(new_entry)
    scores.sort(reverse=True)

    

    #write out only the top 10 scores
    write_to_file(scores,"arcade_scores.txt")


main()
