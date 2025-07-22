qtddaily = int(input('Write the daily amount: '))
type = input('Write the Hosts type: ')

if type == "s" or type == "S":
    print('The value to pay R$ %.2f' %(qtddaily * 255.5))
elif type == 'd' or type == "D":
    print('The value to pay R$ %.2f' %(qtddaily * 305.5))
elif type == "t" or type == "T":
    print('The value to pay R$ %.2f' %(qtddaily * 360.5))
else:
    print('Hosts type invalid!')