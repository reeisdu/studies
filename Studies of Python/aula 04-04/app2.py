# Activitie 2: Here we´re creating the Multiplication Table using the Repetition "while" for that.
# The user´ll write a number, and how the Table is following the logic that the number is
# multiplicating for 1,2,3... We have to create a "x" variable, that will be adding with 1
# while the number that was wrote for the User will be multiplicating with the result of the added number.


print('So, now, you have to write a number and the program will calculate the Multiplication Table.')
number = int(input('Write a number: '))
x = 1
while x <= 10:
    print(number * x)
    x = x + 1

