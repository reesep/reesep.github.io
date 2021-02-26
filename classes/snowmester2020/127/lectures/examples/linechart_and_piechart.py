
import matplotlib.pyplot as plt
import numpy as np

## Line Chart

temp = np.array([32.8, 39.5, 47.6, 57.5, 67.4, 78.0, 85.8, 84.5, 71.85, 58.89, 42.7, 34.5])
months=["Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"]

plt.figure("Line Chart Example")
plt.plot(months,temp,":",marker="+",color="purple")

plt.xlabel("Month")
plt.ylabel("Temperature (F)")
plt.title("Montana Climate by Month")



plt.yticks(np.arange(30,101,5))
plt.show()



## Pie chart


populations = [["Asia",4641054775],["Africa",1340598147],["Europe",747636026],["North America",592072212],["South America",430759766],["Australia",42677813]]

continent = []
numbers = []


explode = (0,0.1,0,0,0,0)
for each_pair in populations:
    continent.append(each_pair[0])
    numbers.append(each_pair[1])

plt.figure("Pie Chart Example")
plt.title("Population by Continent")


print(continent)
print(numbers)

plt.pie(numbers,labels=continent,shadow=True,explode=explode,autopct="%1.1f%%",colors=["purple","black"])

plt.show()






