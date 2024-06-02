# Portfolio
This code is a Java console application designed to help users learn Python by offering various educational resources and activities. The application presents a text-based menu where users can choose from several options to learn key concepts, view code templates, troubleshoot common issues, explore advanced applications, take a quiz, engage in hands-on exercises, and access additional learning resources.

Here's a detailed breakdown of the code:

Main Class: PythonBasics
Main Method:
main(String[] args): This method calls the start() method to initialize the application.

Start Method:
start(): This is the main method that runs the user interface. It displays an introduction and provides a menu with various options:
Reprint Introduction
Key Concepts
Code Templates
Troubleshooting
Advanced Applications
Quiz
Hands-on Exercises
Resources and Links
Exit

Key Concepts Method:
keyConcepts(): Prints information about Python variables, input/output, data types, operations, conditions, loops, and functions. It includes examples to illustrate each concept.
Code Templates Method:
codeTemplates(): Offers a submenu with code templates for basic Python programs such as "Hello World", adding two numbers, swapping variables, and printing output without a newline. It displays the corresponding Python code and its output.

Quiz Method:
quiz():
Builds a set of questions from a file named basicsQuiz.txt.
Prompts the user to select the number of questions for the quiz.
Randomly selects the specified number of questions and quizzes the user, providing immediate feedback on each answer and a final score at the end.

Resources and Links Method:
resourcesAndLinks(): Displays links to external resources for learning Python syntax, variables, and input/output.
Text File Reader/Printer Method:
printTextFile(String fName, boolean stops): Reads and prints the contents of a text file specified by fName. If stops is true, the method pauses at lines containing --stop and waits for user input before continuing.

Other Methods (Placeholders):
advancedApplications(): Placeholder for future content on advanced Python applications.
handsOnExcercises(): Placeholder for future content on hands-on exercises.

Supporting Components:
File I/O: The code reads several text files to provide content for the introduction, key concepts, troubleshooting, resources, and quiz questions.
User Input: Utilizes the Scanner class to handle user input from the console.

Authors and Contributions:
Ryan Jackson: User interface, introduction, quiz, and file reader/printer methods.
Bentley: Key concepts and troubleshooting sections.
SFK: Code templates and resources sections.
Jose: Placeholder methods for advanced applications and hands-on exercises.

This program is structured to assist users in learning Python by presenting educational content in an interactive and user-friendly way. The various sections and activities provide a comprehensive learning experience, from basic concepts to advanced applications and quizzes.
