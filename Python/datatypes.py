"""
Python Data Types
"""

# ==================================================
# INTEGER
# ==================================================

employee_id = 101

print("INTEGER")
print("Employee ID:", employee_id)
print("Type:", type(employee_id))

# ==================================================
# STRING
# ==================================================

employee_name = "Tarunkumar"

print("\nSTRING")
print("Name:", employee_name)
print("Type:", type(employee_name))

print("Length:", len(employee_name))
print("Upper Case:", employee_name.upper())
print("Lower Case:", employee_name.lower())
print("First Character:", employee_name[0])

# F String

print(f"Employee Name is {employee_name}")

# ==================================================
# BOOLEAN
# ==================================================

is_active = True

print("\nBOOLEAN")
print("Employee Active:", is_active)
print("Type:", type(is_active))

if is_active:
    print("Employee is currently active")

# ==================================================
# LIST
# ==================================================

skills = ["Python", "Java", "SQL"]

print("\nLIST")
print("Skills:", skills)
print("Type:", type(skills))

# Accessing element
print("First Skill:", skills[0])

# Adding element
skills.append("Git")

print("After Append:", skills)

# Updating element
skills[1] = "Spring Boot"

print("After Update:", skills)

# Iterating List

print("All Skills:")

for skill in skills:
    print(skill)

# ==================================================
# TUPLE
# ==================================================

coordinates = (19.0760, 72.8777)

print("\nTUPLE")
print("Coordinates:", coordinates)
print("Type:", type(coordinates))

print("Latitude:", coordinates[0])
print("Longitude:", coordinates[1])

# Tuple is immutable
# coordinates[0] = 100   # Error

# ==================================================
# SET
# ==================================================

cities = {"Mumbai", "Pune", "Delhi"}

print("\nSET")
print("Cities:", cities)
print("Type:", type(cities))

# Adding element

cities.add("Hyderabad")

print("After Add:", cities)

# Duplicate values ignored

cities.add("Mumbai")

print("After Adding Duplicate:", cities)

# ==================================================
# DICTIONARY
# ==================================================

employee = {
    "id": 101,
    "name": "Tarun",
    "department": "Engineering",
    "salary": 80000
}

print("\nDICTIONARY")
print(employee)
print("Type:", type(employee))

# Accessing values

print("Employee Name:", employee["name"])
print("Department:", employee["department"])

# Adding new key-value pair

employee["city"] = "Mumbai"

print("After Adding City:")
print(employee)

# Updating value

employee["salary"] = 90000

print("After Salary Update:")
print(employee)

# Iterating Dictionary

print("\nEmployee Details:")

for key, value in employee.items():
    print(key, ":", value)