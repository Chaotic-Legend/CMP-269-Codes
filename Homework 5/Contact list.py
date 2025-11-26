# Read the list of names and phone number pairs from the user input.
pairs = input().split()

# Create a dictionary that will store each contact's name and corresponding phone number.
contacts = {}
for pair in pairs:
    name, number = pair.split(',')
    contacts[name] = number

# Read the name that the program should search for in the dictionary.
search_name = input()

# Print the phone number that corresponds to the searched name.
print(contacts[search_name])
