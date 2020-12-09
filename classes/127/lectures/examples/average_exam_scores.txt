

# Write a python function that will take in a list of
# test scores (of any size) and returns the average of
# those exam scores


def average_exam_scores(score_list):
    sum_of_scores = 0
    num_of_exams = len(score_list)
    for each_score in score_list:
        sum_of_scores += each_score

    average = sum_of_scores / num_of_exams

    return average
        





answer = average_exam_scores([100,80,94,67,88,77])
print(answer)

