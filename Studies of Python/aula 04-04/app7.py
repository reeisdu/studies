# Activitie 7: Binarie number to a Decimal Number.

binary = input('Write a Binarie number: ')
n = len(binary) - 1
decimal = 0

for i in binary:
    decimal = decimal + int(i)*2**n
    n = n - 1

print('The Binary %s its equal %i in decimal base.' %(binary,decimal))