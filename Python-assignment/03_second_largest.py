# second_largest.py
#  Function to find the second largest number in a list
def second_largest(numbers):
    unique_numbers = list(set(numbers))  # Remove duplicates
    if len(unique_numbers) < 2:
        return None
    unique_numbers.sort(reverse=True)
    return unique_numbers[1]

def main():
    input_list = input("Enter a list of integers separated by spaces: ")
    numbers = list(map(int, input_list.strip().split()))
    result = second_largest(numbers)
    if result is not None:
        print("Second largest number is:", result)
    else:
        print("List does not have at least two unique numbers.")

if __name__ == "__main__":
    main()
