import math

def count_factors(n):
    count = 2
    for i in range(2, int(math.sqrt(n))):
        if n % i == 0:
            count += 2
            if i == n // i:
                count -= 1
    return count

print(count_factors(100))
