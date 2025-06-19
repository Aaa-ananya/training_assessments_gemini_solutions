# valid_anagram.py

import re
# Function to clean and sort the string for anagram comparison
def clean_string(s):
    return ''.join(sorted(re.sub(r'[^a-zA-Z0-9]', '', s.lower())))
# Function to check if two strings are valid anagrams
def is_anagram(str1, str2):
    return clean_string(str1) == clean_string(str2)

def main():
    str1 = input("Enter first string: ")
    str2 = input("Enter second string: ")

    if is_anagram(str1, str2):
        print("The strings are valid anagrams.")
    else:
        print("The strings are not anagrams.")

if __name__ == "__main__":
    main()
