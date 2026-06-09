"""
Variables and Constants
"""

# Variable
name = "Tarun"
age = 22

# Constant (Python convention)
PI = 3.14159

print("Name:", name)
print("Age:", age)
print("PI:", PI)


# Local variables
def greet():
    message = "Local bhai"   # Local variable
    print(message)

greet()
# print(message)  # Error: message is not accessible here

message = "Global bhai"   # Global variable

def greet():
    print(message)

greet()
print(message)