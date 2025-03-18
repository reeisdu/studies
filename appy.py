# STUDYING REPETITION: If i wanna write something (phrase or number) without need to do it one a one,
# i can use "for 'x' in range(The number of times)". If i write 100 times, it will repeat
# one number before the chosen one (99).

for phrase in range(101):
    print('I will not use Snapchat in class.')
    # And it will appears 100 times in the screen.






# STUDYING LOOP: If i wanna write a condition that will have a repetition to the client, i can use 'while'.
# Its like a 'Guess the number' you know? 

guess = 0

while guess != 6:
    guess = int(input('Guess the number: '))
else:
    print('Nice dowg, you are good!')

#2 I can make a limit number of tries to the client, and if he does not accept, will appears some message
# like: 'You ran out of tries my king'. And if he accept, will appears another message saying something like
# 'Nice brow, you chose the right one!'.

guess = 0
tries = 0

while guess != 6 and tries < 5:
    guess = int(input('Guess the number: '))
    tries = tries + 1

if guess != 6 and tries == 5:
    print('You ran out of tries, my king')
else:
    print('Nice brow, you chose the right one!')

# Another Example using the PIN theme:

print('BANK OF THE BRAZIL')

pin = int(input('Enter your PIN: '))

while pin != 1517:
    pin = int(input('Incorrect PIN. Enter your PIN again: '))

if pin == 1517:
    print('PIN accepted!')






