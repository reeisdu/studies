num = int(input('Write a integer number: '))

binary = ""
while num != 0:
    r = num%2
    binary = str(r) + binary
    num = num//2

print(binary)