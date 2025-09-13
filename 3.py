def gcd(a,b):
    while b:
        a, b = b, b % a
    return a

print(gcd(18, 12))  
