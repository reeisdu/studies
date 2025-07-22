import math


note = float(input('Write your note of the test that you did: '))
note2 = float(input('Now, write your note of the second test: '))



if note >= 8 and note2 >= 8:
    print('Congradulations! You was Approved!')
elif note < 8 and note2 <8: 
    print('Im sorry, but you was not Approved.')
elif note >= 8 and note2 < 8:
    print('Im sorry, but you was not Approved.')
elif note < 8 and note2 >= 8:
    print('Im sorry, but you was not Approved.')
else:
    print('Wrong input.')

