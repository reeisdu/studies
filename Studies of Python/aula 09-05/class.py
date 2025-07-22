print('Write a number between 0 and 10: ')
number = int(input('Write it here: '))

if 1 <= number <= 10:
    i = 1
elif number > 10:
    print('Wrong Input')

while i <= number:
    print(i)
    i = 1+i

