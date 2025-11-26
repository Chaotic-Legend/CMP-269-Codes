# Read the list of integers from input and convert them into actual integers.
values = list(map(int, input().split()))

# Read the lower and upper bounds and convert them into integers.
low, high = map(int, input().split())

# Loop through the list and print each value that is within the inclusive range.
for num in values:
    if low <= num <= high:
        print(f'{num},', end='')
