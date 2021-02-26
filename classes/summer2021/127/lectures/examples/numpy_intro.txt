import numpy as np

# NumPy Tutorial

a = np.array([2.0, 3.3, 5.8, 7.3])
print("a =\n", a)
print("a.size =", a.size)
print("a.ndim =", a.ndim)
print("a.shape =", a.shape)
print("a.dtype =", a.dtype)
print()

b = np.array([["naif", "brittany", "cooper", "joseph"],
              ["logan", "jacob", "ben", "doug"],
              ["blake", "natalia", "mack", "coleton"]])
print("b =\n", b)
print("b.size =", b.size)
print("b.ndim =", b.ndim)
print("b.shape =", b.shape)
print("b.dtype =", b.dtype)
print()

c = np.arange(1, 40, 2)
print("c =\n", c)
c = c.reshape(4, 5)
print("c =\n", c)
print("c.size =", c.size)
print("c.ndim =", c.ndim)
print("c.shape =", c.shape)
print("c.dtype =", c.dtype)
print()

c += 1                  # this is called broadcasting
print("c = \n", c)
print()

d = np.array([1, 2, 3], dtype="float16")
print("d =\n", d)
print("d.type =", d.dtype)
print()

e = np.zeros(4)
print("e =\n", e)
print()

f = np.ones((4), dtype="int16")
print("f =\n", f)
print()

g = np.linspace(10, 20, 21)
print("g =\n", g)
print()

h = np.random.random(10)
print("h =\n", h)
print()

i = np.random.randint(10, 20, size=(2, 5))
print("i =\n", i)
print()

print("i =")
for row in range(i.shape[0]):
    line = ""
    for col in range(i.shape[1]):
        line += str(i[row][col]) + " "
    print(line)
print()

print("i =")
for row in i:
    line = ""
    for item in row:
        line += str(item) + " "
    print(line)
print()
        

print("i.sum() =", i.sum())                     # Method examples
print("i.min() =", i.min())
print("i.max() =", i.max())
print("i.mean() =", i.mean())

print("np.sqrt(i) =", np.sqrt(i))               # Universal function example
print()

j = np.arange(1, 28).reshape((3,3,3))
print("j =\n", j)
print()
print("j[1:2, :2, 1:] =\n", j[1:2, :2, 1:])     # Slicing         
