num = input('Write a binarie number: ')
n = len(num) - 1
decimal = 0

for c in num:
    decimal = decimal + int(c)*2**n
    n - 1

print('The binarie %s is equal %d in decimal base.' %(num,decimal))
