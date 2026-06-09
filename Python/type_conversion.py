# Type conversion = converting one data type into another

# ==================================================
# 1. Implicit Type Conversion
# ==================================================

base_salary = 50000      # int
bonus_percentage = 7.5   # float

total = base_salary + bonus_percentage

print("Total:", total)
print("Type of total:", type(total))

# ==================================================
# 2. Explicit Type Conversion (Type Casting)
# ==================================================

# int to float

employee_count = 120

employee_count_float = float(employee_count)

print("\nEmployee Count (float):",
      employee_count_float)

# float to int

product_price = 1999.99

product_price_int = int(product_price)

print("Product Price (int):",
      product_price_int)

# int to string

order_id = 1001

order_id_str = str(order_id)

print("\nOrder ID (string):",
      order_id_str)

print("Type:",
      type(order_id_str))

# string to int

quantity_str = "25"

quantity = int(quantity_str)

print("\nQuantity (int):",
      quantity)

# string to float

discount_str = "12.75"

discount = float(discount_str)

print("Discount (float):",
      discount)

# boolean to int

is_member = True

membership_flag = int(is_member)

print("Membership Flag:",
      membership_flag)

# Invalid Conversion Example

invalid_data = "Python"

# number = int(invalid_data)

# ValueError:
# invalid literal for int()

# ==================================================
# 3. Type Conversion in Collections
# ==================================================

# List → Set

employee_ids = [101, 102, 103, 104, 105]

employee_set = set(employee_ids)

print("\nEmployee Set:",
      employee_set)

# Set → List

department_set = {
    "HR",
    "Finance",
    "IT"
}

department_list = list(department_set)

print("Department List:",
      department_list)

# Tuple → List

sales_data = (
    45000,
    50000,
    60000
)

sales_list = list(sales_data)

print("Sales List:",
      sales_list)

# List → Tuple

product_list = [
    "Laptop",
    "Mouse",
    "Keyboard"
]

product_tuple = tuple(product_list)

print("Product Tuple:",
      product_tuple)

# Set → Tuple

city_set = {
    "Mumbai",
    "Pune",
    "Hyderabad"
}

city_tuple = tuple(city_set)

print("City Tuple:",
      city_tuple)

# Tuple → Set

course_tuple = (
    "Python",
    "Java",
    "SQL"
)

course_set = set(course_tuple)

print("Course Set:",
      course_set)

# List → String

skills = [
    "Python",
    "SQL",
    "Git"
]

skills_string = ", ".join(skills)

print("Skills String:",
      skills_string)

# String → List

technologies = "Python Java SQL SpringBoot"

technology_list = technologies.split()

print("Technology List:",
      technology_list)