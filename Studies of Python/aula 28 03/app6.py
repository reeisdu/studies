# Activity
print('If you boght Shoes, the value is U$ 55.60; the respective discount is 25%')
print('If you boght a T-Shirt, the value is U$ 15.45; the respective discount is 35%')
print('If you boght a perfume, the value is U$ 25.30; the respective discount is 20%')
print('NOTE: To calculate the final price of the product, you must have to write on DISCOUNT the value NOT in percentage, but with zero and point (ex: 10% = 0.10)!')


product = float(input('Write the value of your purchase: '))
discount = float(input('Now, you have to write the value of the discount of your purchase IN PERCENTAGE: '))
total = print('Your total price is: '), print('U$:', (product * discount))


