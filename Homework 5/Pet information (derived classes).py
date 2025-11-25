class Pet:
    def __init__(self):
        self.name = ''
        self.age = 0
    
    def print_info(self):
        print(f'Pet Information:')
        print(f'   Name: {self.name}')
        print(f'   Age: {self.age}')

class Cat(Pet):
    def __init__(self):
        Pet.__init__(self) 
        self.breed = ''

my_pet = Pet()
my_cat = Cat()
pet_name = input()
pet_age = int(input())
cat_name = input()
cat_age = int(input())
cat_breed = input()

# Assign name and age to the generic pet and print its info.
my_pet.name = pet_name
my_pet.age = pet_age
my_pet.print_info()

# Assign name, age, and breed to the cat and print its info.
my_cat.name = cat_name
my_cat.age = cat_age
my_cat.breed = cat_breed
my_cat.print_info()

# Print the breed of the cat.
print(f'   Breed: {my_cat.breed}')
