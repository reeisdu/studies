n1 = int(input('Write the first number: '))
n2 = int(input('Write the second number: '))
n3 = int(input('Write the third number: '))

if n1 > n2 and n1 > n3:
    print('The first number is the greater.')
elif n2 > n1 and n2 > n3:
    print('The second number is the greater.')
else:
    print('The third number is the greater.')