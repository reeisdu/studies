# Activitie 1: Here we´re separating the Voters for the age of them. Who has the age below 16 don´t need
# to vote; who has the age more or equal 18 and below or equal 65 are a mandatory voter; and more or equal
#  16 and below or equal 18 or more than 65 are a Optional Voter.


print('You´ll have to write your age and your electoral class')

client = int(input('Your age: '))
if client < 16:
    print('You are not a voter. "You have to thank God brow"')
elif client >= 18 and client <= 65:
    print('You are a mandatory voter. You have to vote obligatorily.')
elif client >= 16 and client <= 18 or client > 65:
    print('You are a optional voter, so you have the choice (for a while HEHEHEHHE).')
else:
    print('Wrong Input.')
