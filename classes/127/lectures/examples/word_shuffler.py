
import random



word = "mississippi"
word = list(word)

random.shuffle(word)

word = "".join(word)

print(word)
