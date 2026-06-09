"""
Functions
"""

# Parameters and Arguments

def greet(name):
    print(f"Hello {name}")

greet("Tarun")


# Return Value

def add(a, b):
    return a + b

result = add(10, 20)

print("Sum:", result)


# *args

def total_marks(*marks):
    total = sum(marks)
    print("Total Marks:", total)

total_marks(80, 90, 70, 85)


# **kwargs

def employee_details(**details):

    for key, value in details.items():
        print(f"{key} : {value}")

employee_details(
    id=101,
    name="Tarun",
    department="Engineering"
)