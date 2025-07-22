num1 = int(input('Write a integer number: '))
num2 = int(input('Write another integer number: '))
num3 = int(input('Write one more man: '))

if num1 < num3 and num1 < num2:
    print('The minor value is: ', num1)
elif num1 >= num3 and num1 <2:
    print('The minor value is: ', num3)
elif num1 > num3 and num1 > num2:
    print('The greater value is: ', num1)
elif num1 < num3 and num3 > num2:
    print('The gratear value is: ', num3)
elif num1 < num2 and num3 < num2:
    print('The greater value is: ', num2)
elif num1 == num3 and num3 == num2:
    print('All the values are the same.')
else:
    print('Wrong Input my dowg')