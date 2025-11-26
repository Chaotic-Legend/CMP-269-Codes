def fibonacci(n):
    # Return -1 for any negative index.
    if n < 0:
        return -1
    
    # The first Fibonacci number is 0.
    if n == 0:
        return 0
    
    # The second Fibonacci number is 1.
    if n == 1:
        return 1

    # Use a loop to compute the sequence iteratively.
    a, b = 0, 1
    for _ in range(2, n + 1):
        a, b = b, a + b
    return b

if __name__ == '__main__':
    start_num = int(input())
    print(f'fibonacci({start_num}) is {fibonacci(start_num)}')
