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






# STUDYING THE SQUARES: if i wanna write a code that makes an account of square of a number, i can do somethins that will save time.
# Example of an account of square:

# num = 5
# square = num ** 2 | It will appears 5² = 25
# print(square) | Left: 25


# Now, i can use a loop "for" to generate the squares of a lot numbers:

# for i in range(1, 6): | It goes from 1 to 5
#     print(f'The square of {i} is {i ** 2}')
 
 


# left:
 
# The square of 1 is 1
# The square of 2 is 4
# The square of 3 is 9
# The square of 4 is 16
# The square of 5 is 25
 
 
 
 
# Understanding it, let´s go back to "range".
# The "range()" generates a sequence of numbers following the logic:
# range(start, end, step)

# The 'start' is the number when starts;
# The 'end' is where the number stops before it arrive (if i write 2, will stop in 3);
# The 'step' determinates if the numbers will grow (+) or decrease (-).


# IMPORTANT: The first number of range and the second, both follow the following logic: The first number will grow till arrives on the second.
# But if you write the first number being greater than the second, that is: range(start>end), the code will need a "step" to decrease, because
# without it, the code never will run. And this step needs to be negative, to generate a code that will decreasing till arrives at end. obs:
# if the step be positive, it will have no logic.



# Example of using the code to print all the verses of "99 Bottles of Beer" (some old song): 

for i in range (99, 0, -1):
    print(f'{i} bottles of beer on the wall')
    print(f'{i} bottles of beer')
    print('Take one down, pass it around')
    print(f'{i-1} Bottles of beer on the wall')







