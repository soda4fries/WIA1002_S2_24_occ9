/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author panglang
 */
public class Test {
    public static void main(String[] args) {
        LinkedList <String> student = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        String name = sc.nextLine();
        while (!name.equals("n")){
            student.add(name);  
            name = sc.nextLine();
        }
        
        System.out.println("\nYou have entered the following students' name: ");
        student.printList();
        
        System.out.println("\nThe number of students entered is : " + student.getSize());
        
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String r = sc.nextLine();
        
        if (r.equals("r")){
            System.out.println("\nEnter the existing student name that you want to rename : ");
            String ori = sc.nextLine();
            System.out.println("\nEnter the new name : ");
            String neww = sc.nextLine();
            student.replace(ori, neww);
        }
        
        System.out.println("\nThe new student list is : ");
        student.printList();
        
        System.out.println("\nDo you want to remove any of your student name? Enter \'y\' for yes, \'n\' to proceed.");
        String ans = sc.nextLine();
        
        if (ans.equals("y")){
            System.out.println("\nEnter a student name to remove : ");
            String remove = sc.nextLine();
            student.removeElement(remove);
        }
        
        System.out.println("\nThe number of updated student is: " + student.getSize());
        System.out.println("The updated student list is: ");
        student.printList();
        
        System.out.println("\nAll student data captured complete. Thank you!");
    }
    
}
/*
Rahmat
Alice
Fatymah
Yoke Ling
Maniam
Abu
*/