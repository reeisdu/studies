m = float(input('Write the media: '))
f = float(input('Write the percentage of the frequence: '))


if f > 75:
    print('Failed due to absence.')
else:
    if m < 6:
        print('Failed due to note.')
    else:
        print('Approved!')