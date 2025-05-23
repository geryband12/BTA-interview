import json

def load_employees(filepath):
    with open(filepath, 'r') as f:
        return json.load(f)

def average_salary_by_department(employees):
    # TODO: Implement average salary calculation
    pass

if __name__ == '__main__':
    employees = load_employees('employees.json')
    result = average_salary_by_department(employees)
    print(result)
