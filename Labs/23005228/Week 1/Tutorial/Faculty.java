package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 9/3/2024
 * Objective: Q2: What is the output for the following? Explain.
 */

//Output:
/*
(1) Performs Person's tasks
(2) Invoke Employee's overloaded constructor
(3) Performs Employee's tasks 
(4) Performs Faculty's tasks

- In the main method, it create an instance of the Faculty class , which is a subclass of Employee class. 
  However, Employee class is also a subclass of class Person. 
- Therefore, the first line output (Person) from the empty constructor is executed.
- The second line output is printed from the parameterized constructor of the Employee class. 
  The empty constructor has a call (this) to this parameterized constructor (String s).
- Next, the third line output is executed by the empty constructor from Employee class after the second line 
  output printed.
- The last line output is printed from the empty constructor of Faculty class. 
- The entire execution process is done, starting from the topmost superclass (Person) down to the subclass (Faculty).


*/

class Person { 
    public Person() { 
        System.out.println("(1) Performs Person's tasks"); 
    } 
} 
class Employee extends Person { 
    public Employee() { 
        this("(2) Invoke Employee's overloaded constructor"); 
        System.out.println("(3) Performs Employee's tasks "); 
    } 
    public Employee(String s) { 
        System.out.println(s); 
    } 
} 


public class Faculty extends Employee { 
    public Faculty() { 
        System.out.println("(4) Performs Faculty's tasks"); 
    } 
    public static void main(String[] args) { 
        new Faculty(); //new: create an instance (object) of a class.
    } 
} 
