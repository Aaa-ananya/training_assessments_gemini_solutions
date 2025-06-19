# fibonacci_primes.py

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5)+1):
        if n % i == 0:
            return False
    return True

# Function to generate Fibonacci sequence up to a given number n
def generate_fibonacci(n):
    fib = [0, 1]
    while fib[-1] + fib[-2] <= n:
        fib.append(fib[-1] + fib[-2])
    return fib

# Generation of Fibonacci sequence and extraction of prime numbers
def fibonacci_primes(n):
    fib_sequence = generate_fibonacci(n)
    prime_numbers = [num for num in fib_sequence if is_prime(num)]
    print("Fibonacci Sequence:", fib_sequence)
    print("Prime Numbers in Fibonacci:", prime_numbers)

def main():
    n = int(input("Enter the maximum value for Fibonacci sequence: "))
    fibonacci_primes(n)

if __name__ == "__main__":
    main()
