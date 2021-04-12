

# Module 1
- Introduction to Object Oriented Concepts:
- A Review of structures
- Procedure–Oriented Programming system
- Object Oriented
- Programming System
- Comparison of Object Oriented Language with C
- Console I/O,
- variables
- reference variables
- Function Prototyping
- Function Overloading
- Class and Objects
  - Introduction
  - members functions and data, 
  - objects and functions.

# Module 2
- Class and Objects
- Objects
- arrays
- Namespaces
- Nested classes
- Constructors
- Destructors.
- Introduction to Java
- Java’s magic: the Byte code
- Java Development Kit (JDK)
- the Java Buzzwords
- Object-oriented programming
- Simple Java programs
- Data types
- variables
- Operators-
- Control Statements.

## variables
- local variable
- global variable
- reference variable

## Data types
- Int
- Byte
- float
- double
- string
- small int
- long int


## Classes
- Abstract Class
- Abstract method
- SubClass Class
- Super(base) Class
- Object Class
- Class members
- Class Methods
- Constructor
- Default Constructor
- Parameterized Constructor

## Control Statements
- if
- else
- else if
- switch
- for
- foreach
- while
- do while

# Module 3
- Classes
- Inheritance
- Exception Handling
- Classes fundamentals
- Declaring objects;
- Constructors
- this keyword
- garbage collection
- Inheritance
- inheritance basics
- using super
- creating multi level hierarchy
- method overriding
- Exception handling
- Exception handling in Java.

# Module 4

- Packages and Interfaces:
- Packages, Access Protection
- Importing Packages.Interfaces.
- Multi Threaded Programming:
- Multi Threaded Programming:
- What are threads? How to
- make the classes threadable ;
- Extending threads 
- Implementing runnable 
- Synchronization;
- Changing state of the thread 
- Bounded buffer problems
- producer consumer problems.

# Module 5
- Event Handling: -
- Two event handling mechanisms 
- The delegation event model
- classes; 
- Sources of events; 
- Event listener interfaces; 
- Using the delegation event model;
- Adapter classes; 
- Inner classes.Swings: 
- Swings: The origins of Swing; 
- JTextField;The Swing Buttons 
- JTabbedpane; 
- JScrollPane; 
- JList;
- JComboBox; JTable.

## Event Handling

### What is Event Handling

### Two Event Mechanism
- Event Model Java 1.0
- Delegation Event Model Java 1.1

### The Delegation Event Model
- A source generates an event and sends it to one or more listeners.
- In this scheme, the listener simply waits until it receives an event. - - Once an event is received, the listener processes the event
and then returns.

#### What is the Advantages of the Delegation Event Model
- The advantage of this design is that the application logic that processes events is **cleanly separated from the user interface** logic that generates those events. 
- A user interface element is able to “delegate” the processing of an event to a separate piece of code.

### Rules
- In the delegation event model, listeners must register with a source in order to receive an event notification. 
- This provides an important benefit: notifications are sent only to listeners that want to receive them. This is a more efficient way to handle events than the design used
by the old Java 1.0 approach. 

### What is the Event handling approach in Java 1.0?
- In Java 1.0, an event was propagated up the containment hierarchy
until it was handled by a component. This required components to receive events that they did not process, and it wasted valuable time. The delegation event model eliminates this overhead.

