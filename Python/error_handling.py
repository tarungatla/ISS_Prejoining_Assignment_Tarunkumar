"""
Error Handling
"""

# try-except

try:
    number = int(input("Enter a Number: "))
    result = 100 / number
    print(result)

except ValueError:
    print("Please enter a valid integer.")

except ZeroDivisionError:
    print("Cannot divide by zero.")

# else

else:
    print("Operation Successful.")

# finally

finally:
    print("Execution Completed.")


# raise

age = 15

try:
    if age < 18:
        raise ValueError(
            "Age must be 18 or above."
        )

except ValueError as e:
    print(e)