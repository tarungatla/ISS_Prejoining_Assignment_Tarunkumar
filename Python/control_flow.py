"""
Control Flow Statements
"""

age = 20

# if-else
if age >= 18:
    print("Eligible to Vote")
else:
    print("Not Eligible")

# for loop
print("\nFor Loop")

for i in range(1, 6):
    print(i)

# while loop
print("\nWhile Loop")

count = 1

while count <= 3:
    print(count)
    count += 1

# break
print("\nBreak Example")

for number in range(1, 10):

    if number == 5:
        break

    print(number)

# continue
print("\nContinue Example")

for number in range(1, 6):

    if number == 3:
        continue

    print(number)

# pass
print("\nPass Example")

for number in range(1, 4):

    if number == 2:
        pass

    print(number)

# loop else
print("\nLoop Else Example")

for number in range(1, 4):
    print(number)
else:
    print("Loop Completed Successfully")