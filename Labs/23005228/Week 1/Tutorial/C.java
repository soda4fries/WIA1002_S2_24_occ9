package Tutorial;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 9/3/2024
 * Objective: Q3: What is the output for the following? Explain.
 */

/*
Output: a. AB
- In the main method, there is an array of Object is created(o) with size of 2.
- The first element is the instance of A class, and the second element is the instance of B class.
- System executes first and second elements, with the index number of 0 and 1.
- The first element is the instance of A class. A class is the subclass of B. The toString method 
  is called and return "A".
- The second element is the instance of B class. B class is the superclass. The toString method 
  is called and return "B".
*/

public class C { 
    public static void main(String[] args) { 
        Object[] o = {new A(), new B()}; 
        System.out.print(o[0]); 
        System.out.print(o[1]);    
    } 
} 
 
    class A extends B { 
        public String toString() { 
            return "A"; 
        } 
    } 
 
    class B { 
        public String toString() { 
            return "B"; 
        }   
    }
