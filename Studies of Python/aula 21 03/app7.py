# Activitie 2

print('My dog, you will have to write two numbers, one a one, and thats it. Good lucky!')

a = int(input('Write a value: '))
a2 = int(input('Write another value, please: '))

if a > a2:
    print('The greater value is: ', a)
elif a < a2:
    print('The grater value is: ', a2)
elif a == a2:
    print('The grater value is: ', a2, 'Of course is the second number that you wrote.')
else:
    print('Wrong Input.')