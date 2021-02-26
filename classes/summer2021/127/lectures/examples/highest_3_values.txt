

dictionary = { "a": 49,
               "b": 100,
               "c": 78,
               "d": 12,
               "e": 88,
               "f": 91,
               "g": 45,
               "h": 70
            }

for i in range(3):
    largest_so_far = 0
    largest_key_so_far = ""
    for key, val in dictionary.items():

        if val > largest_so_far:
            largest_so_far = val
            largest_key_so_far = key

    print(largest_so_far)
    del dictionary[largest_key_so_far]


