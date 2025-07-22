counter = 0
sum = 0
resp = "s"

while resp == "s" or resp == "S":
    num = float(input('Write a number: '))
    sum = sum + num
    counter = counter + 1
    resp = input('Do you wish to continue (S/N)?')

media = sum / counter
print('The Digited Number´s Media is %.2f' %media)