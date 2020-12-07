
# Rewrite the function sumTo(n) that returns the sum of all
# integer numbers up to and including n. This time use the
# accumulator pattern.

# sumTo(6) = 1 + 2 + 3 + 4 + 5 + 6 = 21
# sumTo(10) = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55


def sumToN(n):

    answer = 0
    for x in range(1,n+1):
        answer = answer + x  # accumaltor pattern

    return answer
        

def main():

    print(sumToN(6))

main()
