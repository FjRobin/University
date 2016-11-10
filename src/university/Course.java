package university;

import java.util.Scanner;

public class Course {
protected String Course_code;
protected String Course_title;
protected int enrolled_std;
protected int credit_hours;
Scanner input= new Scanner(System.in);
Course(){
    enrolled_std=0;
 }
// add student
protected void set_enrollted_std(){
 enrolled_std+=1;
}

protected int get_enrolled_std(){
return enrolled_std;
}
protected void print_enrolled_std(){
 System.out.println("enrolled_std: "+enrolled_std);
}
//basic method
  protected void input_Course_code(){
  System.out.print("input_Course_code: ");
  Course_code= input.next();
 }
 protected String get_Course_code(){
   return Course_code;
 }
 protected void print_Course_code(){
     System.out.println("Course_code is: "+ Course_code);
 }
 
   protected void input_Course_title(){
  System.out.print("input_Course_title: ");
  Course_title= input.next();
 }
 protected String get_Course_title(){
   return Course_title;
 }
 protected void print_Course_title(){
     System.out.println("Course_title is: "+ Course_title);
 }

 protected void input_credit_hours(){
  System.out.print("input_credit_hours: ");
  credit_hours= input.nextInt();
 }
 protected int get_credit_hours(){
   return credit_hours;
 }
 protected void print_credit_hours(){
     System.out.println("credit_hours is: "+ credit_hours);
 }
}
