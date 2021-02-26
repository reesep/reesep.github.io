
scores = [0, 31, 27, 31, 49, 21, 17, 25] #[msu-score-1, opponent-score-1, msu-score2, 
                                         # opponent-score2, …]
wins= 0
losses = 0
                #range(start,stopping,step)
for i in range(0,len(scores),2):

    if(scores[i] > scores[i+1]):
        wins += 1
    else:
        losses += 1
    #check to see if the current score (i) is greater/less than the next score in list



print("MSU has", wins, "win(s) and", losses," loss(es)")
