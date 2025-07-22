import math

num = float(input('Write a number (whatever): '))
if num > 0:
    r = math.sqrt(num)
    print('The square root if the digited number is: ', r)
else:
    print('Its not possible to calculate the square root of a negative number.')
