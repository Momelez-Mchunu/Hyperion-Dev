## Complexity Analysis( Worst Case)
The worst-case space complexity of the check_ISBN function is O(n), where n is the length of the input string.

In the worst case, the input string is an ISBN-10 or ISBN-13 number that must be processed and stored in memory.The function creates a new StringBuilder object to hold the converted ISBN-13 number, which has a space complexity of O(n) as well.

Total complexity is then O(n)+O(n) = O(2n) = O(n)


## Setup
- Ensure to have Java installed

## Executing
- Open command line and run ```javac SectionC.java``` to compile
- use ```java SectionC.java``` after you have compiled

## Testing
- The JUnit test cases have been incorporated
- Insert tests of your own into the ```SectionCTest.java``` file 
- Compile & then run the test same way as above