import matplotlib.pyplot as plt
import random
import numpy as np


## Bar Chart
scores = []
for i in range(5):
    scores.append(random.randint(50,100))


print(scores)

names = ["Miguel","Sam","Tory","Hawk","Robby"]

print(names)

plt.figure("Bar Chart Example")

plt.bar(names,scores,color=["blue","yellow","salmon"])

plt.ylabel("Exam Score")
plt.xlabel("Student Name")

plt.title("CSCI 127 Exam Scores")

plt.show()


## Scatter Plot

height = np.array([60,63,77,72,68,69,72,70])
weights = np.array([120, 133, 150, 170, 122, 141, 135,160])
plt.figure("Scatter Plot Example")
plt.ylabel("Weights")
plt.xlabel("Heights")
plt.title("Weight vs Height")



plt.scatter(height,weights,marker="*",c="maroon")

plt.xticks(np.arange(56,79,2))
plt.yticks(np.arange(120,186,5))

plt.show()




