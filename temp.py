numbers = [1, 2, 3, 4]
alfs = ['a', 'b', 'c']
print(*number)
for number, alf in zip(numbers, alfs):
    print(number,"=",alf)