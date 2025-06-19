# file_analysis.py
#This script analyzes a text file and provides statistics about its content.
def analyze_file(file_path):
   # Function to analyze the file and print statistics
    try:
        with open(file_path, 'r') as file:
            lines = file.readlines()
            num_lines = len(lines)
            num_words = sum(len(line.split()) for line in lines)
            num_chars = sum(len(line) for line in lines)

        print("File Analysis Result:")
        print(f"Total Lines: {num_lines}")
        print(f"Total Words: {num_words}")
        print(f"Total Characters: {num_chars}")
#        if num_lines > 0:
#            print(f"Average Words per Line: {num_words / num_lines:.2f
    except FileNotFoundError:
        print("Error: File not found. Please check the file path.")

def main():
    file_path = input("Enter the file path to analyze: ")
    analyze_file(file_path)

if __name__ == "__main__":
    main()
