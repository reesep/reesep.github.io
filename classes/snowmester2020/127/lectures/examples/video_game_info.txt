

def video_game_info(filename):

    video_games = { (0,9):[0,0,0,0],
                    (10,19):[0,0,0,0],
                    (20,29):[0,0,0,0],
                    (30,39):[0,0,0,0],
                    (40,49):[0,0,0,0],
                    (50,59):[0,0,0,0],
                    (60,69):[0,0,0,0],
                    (70,79):[0,0,0,0],
                    (80,89):[0,0,0,0],
                    (90,100):[0,0,0,0]
                }
    file = open(filename,"r")
    file.readline()

    for each_line in file:
        row = each_line.split(",")
        #print(row[-27])

        for key in video_games.keys():
            if(key[0] <= int(row[-27]) <= key[1]):
                video_games[key][0] += 1
                if(row[-23] == "E"):
                    video_games[key][1] += 1
                if(row[-23] == "T"):
                    video_games[key][2] += 1
                if(row[-23] == "M"):
                    video_games[key][3] += 1
                    
    


    for key, val in video_games.items():
        print("Number of games between",key[0],"and",str(key[1])+": ",val[0])
        print("        Number of games rated E:",val[1])
        print("        Number of games rated T:",val[2])
        print("        Number of games rated M:",val[3])
                    



    # print results


def main():

    video_game_info("video_games.csv")


main()
