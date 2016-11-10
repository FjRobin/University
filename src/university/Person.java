
package university;

import java.util.Scanner;

public class Person {
    protected String FirstName;
    protected String LastName;
    protected String Department;
    protected int Age;
    Scanner input = new Scanner(System.in);
    Person(){
 }

 protected void input_FirstName(){
     System.out.print("input_FirstName: ");
     FirstName= input.next();
 }
 protected String get_FirstName(){
   return FirstName;
 }
 protected void print_FirstName(){
     System.out.println("FirstName is: "+ FirstName);
 }
 
 protected void input_LastName(){
     System.out.print("input_LastName: ");
     LastName= input.next();
 }
 protected String get_LastName(){
   return LastName;
 }
 protected void print_LastName(){
     System.out.println("LastName is: "+ LastName);
 }
 
 protected void print_Name(){
     System.out.println("Name is: "+ FirstName+" "+LastName);
 }
 protected void input_Department(){
     System.out.print("input_Department: ");
     Department= input.next();
 }
 protected String get_Department(){
   return Department;
 }
 protected void print_Department(){
     System.out.println("Department is: "+ Department);
 }
 
 protected void input_Age(){
     System.out.print("input_Age: ");
     Age= input.nextInt();
 }
 protected int get_Age(){
   return Age;
 }
 protected void print_Age(){
     System.out.println("Age is: "+ Age);
 }
 
}
