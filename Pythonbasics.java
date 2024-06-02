/**
 * Authors: Bentley
 * Date: 
 * Class: CIS 232-001
 * 
 * This program aims to assist the user in learning about Python using methods covering
 * key concepts, code examples, troubleshooting examples, advaced applications, hands on excercises,
 * a quiz and links to other material for the user to continue learning.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


class PythonBasics {
    public static void main(String[] args) {
        start();
    }


    //Basic UI
    //Ryan Jackson w/ help from group
    public static void start() {
        Scanner in = new Scanner(System.in);
        String input = "A";

        //Show introduction when first starting
        printTextFile("BasicsIntro.txt", false);
        
        do {

            //Print choices
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Reprint Introduction \n2. Key Concepts\n3. Code Templates\n4. Troubleshooting");
            System.out.println("5. Advanced Applications\n6. Quiz\n7. Hands on Excercises\n8. Resources and Links");
            System.out.println("0. Exit");

            //Prompt user again if input is out of range
            do {
                System.out.print("Choice: ");
                input = in.nextLine();
             } while(!input.matches("[0-8]") || input.length() > 1);

            //Call method based on input
            switch(input) {
                case "1":
                    //Introduction
                    //Author: Ryan Jackson
                    printTextFile("BasicsIntro.txt", false);
                    break;
                case "2":
                    //Key Concepts
                    //Author: Bentley
                    printTextFile("BasicsKeyConcepts.txt", true);
                    break;
                case "3":
                    //Code Templates
                    //Author: SFK
                    codeTemplates();
                    break;
                case "4":
                    //Troubleshooting
                    //Author: Bentley
                    printTextFile("BasicsTroubleshooting.txt", true);
                    break;
                case "5":
                    //Advanced Applications
                    //Author: Jose
                    //advancedApplications();
                    break;
                case "6":
                    //Quiz
                    //Author: Ryan Jackson
                    quiz();
                    break;
                case "7":
                    //Hands on Excercises
                    //Author: Jose
                    //handsOnExcercises();
                    break;
                case "8":
                    //Resources
                    //Author: SFK
                    printTextFile("BasicsResources.txt", true);
            }
        } while(!input.equalsIgnoreCase("0"));

        in.close();
    }

    
    //Key Concepts
    //Author: Bentley
    static void keyConcepts() {
        // Variables
        System.out.println("Variables");
        System.out.println("Python uses variables to store data values.");
        System.out.println("They serve as placeholders for a variety of data kinds, including integers, strings, lists, and more.");
        System.out.println("Here are some important characteristics of variables in Python.");
        
        // Example
        System.out.println("\nExample:");
        int x = 10;
        String y = "Hello";
        System.out.println("x = " + x);
        System.out.println("y = \"" + y + "\"");

        // Input and Output
        System.out.println("\n Input and Output");
        System.out.println("Python has built-in routines for accepting user input (input()) and printing output.");
        System.out.println("The input() function prompts the user for input before returning a string containing the user's input.");
        System.out.println("The print() method is used to display output on the console.");
        
        // Example
        System.out.println("\nExample:");
        System.out.println("Scanner scanner = new Scanner(System.in);");
        System.out.println("System.out.print(\"Enter your name: \");");
        System.out.println("String name = scanner.nextLine();");
        System.out.println("System.out.println(\"Hello, \" + name);");

        // Data types
        System.out.println("\n Data types");
        System.out.println("// Integers");
        System.out.println("// Floats");
        System.out.println("// Strings");
        System.out.println("// Booleans");
        System.out.println("// Lists");

        // Examples
        System.out.println("\nExamples:");
        int a = 5;
        double b = 3.14;
        String nameString = "Kylie";
        boolean is_valid = true;
        int[] my_list = {1, 2, 3};

        // Operations
        System.out.println("\n Operations");
        System.out.println("Arithmetic: +, -, *, /, %, ++, --.");
        System.out.println("Comparison: ==, !=, <, >, <=, >=.");
        System.out.println("Logical: &&, ||, !.");
        System.out.println("Assignment: =, +=, -=, *=, /=.");

        // Example
        System.out.println("\nExample:");
        int p = 5 + 3;
        double q = 10.0 / 2;
        boolean isValid = (p > q) && (q < 10);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("isValid = " + isValid);

        // Conditions
        System.out.println("\n Conditions");
        System.out.println("Used for decision making based on conditions.");
        System.out.println("if, else if, else are used.");
        System.out.println("Braces are used to denote code blocks.");

        // Examples
        System.out.println("\nExamples:");
        int c = 10;
        if (c > 5) {
            System.out.println("    System.out.println(\"x is greater than 5\");");
        } else if (c == 5) {
            System.out.println("    System.out.println(\"x is equal to 5\");");
        } else {
            System.out.println("    System.out.println(\"x is less than 5\");");
        }

        // Loops
        System.out.println("\n Loops");
        System.out.println("Used to iterate over sequences or execute a block of code repeatedly.");
        System.out.println("for loop: Iterate over a sequence.");
        System.out.println("while loop: Execute a block of code until a condition is false.");

        // Examples
        System.out.println("\nExamples:");
        for (int i = 0; i < 5; i++) {
            System.out.println("    System.out.println(i);");
        }

        int z = 0;
        while (z < 5) {
            System.out.println("System.out.println(x);");
            z++;
        }

        // Functions
        System.out.println("\n Functions");
        System.out.println("Blocks of reusable code.");
        System.out.println("Defined using the void keyword.");
        System.out.println("Can take parameters and return values.");

        // Examples
        System.out.println("\nExamples:");
        System.out.println("void greet(String name) {");
        System.out.println("    System.out.println(\"Hello, \" + name);");
        System.out.println("}");
        System.out.println("greet(\"Alice\");");
    
    }


    //Code Templates
    //Author: SFK
    static void codeTemplates() {
        int choice;

        System.out.println("This page will give you pre-designed code templates to help you understand Python and guide you in writing functional code snippets\n");

        Scanner scanner = new Scanner(System.in); 

        do{
            System.out.println("1. Hello World");
            System.out.println("2. Add Two Numbers");
            System.out.println("3. Swapping Variables");
            System.out.println("4. Print Output Without a Newline");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();  // Read user's choice
            scanner.nextLine(); // Consume newline character
 
            // Switch statement to handle different menu choices
            switch (choice) {

                case 1:  // Hello World
                    System.out.print("\nThis program is the basic program everyone learns when learning code:\n");
                    System.out.print("# This program prints Hello, world!\r\n" + //
                                                "\r\n" + //
                                                "print('Hello, world!')\n ");
                    System.out.println("This Outputs\n");    
                    System.out.println("Hello, world!\n");
                    break;

                case 2:  // Add Two Numbers
                    System.out.println("# This program adds two numbers\r\n" + //
                                                "\r\n" + //
                                                "num1 = 1.5\r\n" + //
                                                "num2 = 6.3\r\n" + //
                                                "\r\n" + //
                                                "# Add two numbers\r\n" + //
                                                "sum = num1 + num2\r\n" + //
                                                "\r\n" + //
                                                "# Display the sum\r\n" + //
                                                "print('The sum of {0} and {1} is {2}'.format(num1, num2, sum))\n");
                    System.out.println("This Outputs\n");
                    System.out.println("The sum of 1.5 and 6.3 is 7.8\n");
                    break;

                case 3:  // Swapping Variables
                    System.out.println("# Python program to swap two variables\r\n" + //
                                                "\r\n" + //
                                                "x = 5\r\n" + //
                                                "y = 10\r\n" + //
                                                "\r\n" + //
                                                "# To take inputs from the user\r\n" + //
                                                "#x = input('Enter value of x: ')\r\n" + //
                                                "#y = input('Enter value of y: ')\r\n" + //
                                                "\r\n" + //
                                                "# create a temporary variable and swap the values\r\n" + //
                                                "temp = x\r\n" + //
                                                "x = y\r\n" + //
                                                "y = temp\r\n" + //
                                                "\r\n" + //
                                                "print('The value of x after swapping: {}'.format(x))\r\n" + //
                                                "print('The value of y after swapping: {}'.format(y))\n");
                    System.out.println("This outputs\n");
                    System.out.println("The value of x after swapping: 10");
                    System.out.println("The value of y after swapping: 5\n");
                    break;

                case 4:  // Remove User Profile
                    System.out.println("# print each statement on a new line\r\n" + //
                                                "print(\"Python\")\r\n" + //
                                                "print(\"is easy to learn.\")\r\n" + //
                                                "\r\n" + //
                                                "# new line\r\n" + //
                                                "print()\r\n" + //
                                                "\r\n" + //
                                                "# print both the statements on a single line\r\n" + //
                                                "print(\"Python\", end=\" \")\r\n" + //
                                                "print(\"is easy to learn.\")");
                    System.out.println("This outputs:\n");
                    System.out.println("PythonPython\r\n" + //
                                                "is easy to learn.\r\n" + //
                                                "\r\n" + //
                                                "Python is easy to learn.\n");
                    break;
                case 5:  // Exit
                    System.out.println("Exiting...");
                    break;

                default:  // Invalid choice
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);  // Repeat until user chooses to exit
 
    }


    //Advanced Applications
    //Author: Jose
    static void advancedApplications() {

    }


    //20 question quiz
    //Author: Ryan Jackson
    static void quiz() {
        try {
            //Step 1: Build question set from file

            //ArrayList for storing questions read from file
            ArrayList<String> questions = new ArrayList<>();
            //HashMap for question number and answer char pairs
            HashMap<Integer, Character> answerKey = new HashMap<>();

            //Used in multiple steps for input/counting
            int temp = 0; 
        
            File file = new File("basicsQuiz.txt");
            Scanner f = new Scanner(file);
            //StringBuilder for collecting questions + choices to be added as single element
            StringBuilder q = new StringBuilder();
            //Valid responses for user, forced to uppercase for checks
            String possibleChoices = f.nextLine().toUpperCase();
            //Number of choices per question
            int choiceCount = possibleChoices.length();
        
            while(f.hasNextLine()) {
                //Collect queston and all but last choice into single string
                for(int i = 0; i < choiceCount; i++) {
                    //Append each line with a newline at the end
                    q.append(f.nextLine() + "\n");
                }
                //Append last choice without newline
                q.append(f.nextLine());
                //Save string to ArrayList and clear StringBuilder
                questions.add(q.toString());
                q.setLength(0);
                
                //Save answer pair
                answerKey.put(temp, f.nextLine().charAt(0));
                temp++;
            }
            f.close();


            //Step 2: Greet user and set up quiz options

            Scanner in = new Scanner(System.in);
            String input;

            System.out.println("\nWelcome to the quiz section. Here you can select the amount of questions you want to recieve.\n" +
                                        "You'll recieve feedback after each question and see your final score at the end.");

            //Prompt user for number of questions to display
            do {
                do { //Get input and check if all numbers
                    System.out.print("How many questions do you want on this quiz? (1-" + questions.size() + "): ");
                    input = in.nextLine();
                } while(!input.matches("^[0-9]*$")); //Make sure only numbers
            
                temp = Integer.parseInt(input);
            } while(temp < 1 || temp > questions.size()); //Make sure requested amount is not more than avaliable questions

            //Generate list of numbers to use for pulling questions
            ArrayList<Integer> randQuestions = new ArrayList<>();
            Random r = new Random();

            //Populate array with unique integers within range of questions
            for(int i = 0; i < temp;) {
                int randInt = r.nextInt(questions.size());
                boolean unique = true;

                //Check new integer against each in array
                for(int j : randQuestions) {
                    if(j == randInt) {
                        unique = false;
                        break; //Exit loop if matched
                    }
                }
                if(unique) {
                    randQuestions.add(randInt);
                    i++;
                }
            }


            //Step 3: Run quiz

            //Quiz score, 1 point per question
            temp = 0;

            //Quiz introduction
            System.out.println("There will be " + randQuestions.size() + " question(s) regarding basic python.");
            System.out.println("Let's begin.");

            //Quiz loop
            for(int i : randQuestions) {
                //Output question
                System.out.println("\n" + questions.get(i));

                //Loop until input is a single character within the possible choices
                do {
                    System.out.print("Answer: ");
                    input = in.nextLine().toUpperCase();
                } while(!input.matches("[" + possibleChoices + "]") || input.length() > 1); //Check input against regex string using possibleChoices

                //Check answer against character value in HashMap
                if(input.charAt(0) == answerKey.get(i)) {
                    temp++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect, expected answer: " + answerKey.get(i));
                }
            }

            //Output final score
            System.out.println("\nScore: " + temp + "/" + randQuestions.size());
            if(temp >= randQuestions.size()) {
                System.out.println("Perfect score!");
            }
            System.out.println("Press Enter to return to main menu.");
            in.nextLine();

        } catch(FileNotFoundException e) { //Throws file not found if no basicQuiz.txt
            System.out.println("Error: basicQuiz.txt not found in directory. Contact the program provider for assistance.");
        }
    }


    //Hands on Excercises
    //Author: Jose
    static void handsOnExcercises() {

    }


    //Resources
    //Author: SFK
    static void resourcesAndLinks() {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("These are the multiple sources and websites you can go to study in more detail about Pythons's basic synatx, variables, and input/output\n");

        System.out.println("Press Enter to resources for syntax.");
        scanner.nextLine();

        //Basic Syntax
        System.out.println("These are good sources to have better understanding of Syntax in Python:\n");
        System.out.println("https://www.w3schools.com/python/python_syntax.asp");
        System.out.println("https://www.tutorialspoint.com/python/python_basic_syntax.htm");
        System.out.println("https://www.codecademy.com/article/learn-python-python-syntax");
        System.out.println("https://www.geeksforgeeks.org/python-syntax/");
        System.out.println("https://docs.python.org/3/tutorial/index.html\n");

        System.out.println("Press Enter to show resources for variables.");
        scanner.nextLine();
    
        //Variables
        System.out.println("These are good sources to have better understanding of variables in Python:\n");
        System.out.println("https://www.w3schools.com/python/python_variables.asp");
        System.out.println("https://www.geeksforgeeks.org/python-variables/");
        System.out.println("https://www.tutorialspoint.com/python/python_variables.htm");
        System.out.println("https://beginnersbook.com/2019/03/python-variables/");
        System.out.println("https://www.youtube.com/watch?v=LKFrQXaoSMQ\n");

        System.out.println("Press Enter to show resources for input/output.");
        scanner.nextLine();
    
        //input-output
        System.out.println("These are good sources to have better understanding of input/output in Python:\n");
        System.out.println("https://docs.python.org/3/tutorial/inputoutput.html");
        System.out.println("https://www.geeksforgeeks.org/input-and-output-in-python/");
        System.out.println("https://www.scaler.com/topics/python/python-input-and-output/");
        System.out.println("https://www.softwaretestinghelp.com/python/input-output-python-files/");
        System.out.println("https://muzny.github.io/csci1200-notes/10/1/fileio.html");

        System.out.println("Press Enter to return to basics menu.");
        scanner.nextLine();
        scanner.close();
    }
    

    //Text file Rader/Printer
    //Author: Ryan Jackson
    static void printTextFile(String fName, boolean stops) {
        //Read a file wth the name given from the argument and print each line
        //If stops is true, it will pause and wait for input each time "--stop" is encountered on a line in the file
        Scanner in = new Scanner(System.in);
        System.out.println();
        try {
            //Create File object using string given from argument
            File file = new File(fName);
            Scanner f = new Scanner(file);
            String line;
            //Loop as long as there are new lines to read
            while(f.hasNextLine()) {
                line = f.nextLine();
                //If stops is true, stop at lines starting with # and skip printing them after getting put
                if(stops && line.equalsIgnoreCase("--stop")) {
                    System.out.print("Press Enter to continue.");
                    in.nextLine();
                } else {
                    System.out.println(line);
                }
            }
            f.close();
        } catch(FileNotFoundException e) { //If file is not found, inform user
            System.out.println("Error: Expected file not found in directory.\nContact the program provider for assistance.\n" + e);
        }
    }
}

