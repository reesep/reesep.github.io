

def factorial(x):

    # base case
    if x == 1:
        return 1
    

    # recursive case
    else:
        return x * factorial(x-1)


def main():
    ans = factorial(5)

    print(ans)

    



main()
