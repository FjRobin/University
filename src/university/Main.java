package university;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("No of Student:");
     int s= input.nextInt();
     System.out.print("No of Course:");
     int c= input.nextInt();
     System.out.print("No of Teachers:");
     int t= input.nextInt();
     System.out.print("No of Staff:");
     int staff= input.nextInt();
     System.out.print("No of course a student can take:");
     int noOfCourse= input.nextInt();
     
     //create array of objects
     Student[] std=new Student[s];
     Teacher[] tea= new Teacher[t];
     Course[] course= new Course[c];
     Staff[] sta=new Staff[staff];
     // basic input for student
     for (int i = 0; i < s; i++) {
          System.out.println("Input for student-"+(i+1));
          std[i]=new Student(noOfCourse);
          std[i].input_FirstName();
          std[i].input_LastName();
          std[i].input_Department();
          std[i].input_Age();
        }
    
    // basic input for teachers
     for (int i = 0; i < t; i++) {
         System.out.println("Input for teacher-"+(i+1));
          tea[i]=new Teacher();
          tea[i].input_Employee_id();
          tea[i].input_FirstName();
          tea[i].input_LastName();
          tea[i].input_Department();
          tea[i].input_Age();
          tea[i].input_monthly_Salary();
        }
      // basic input for Course
     for (int i = 0; i < c; i++) {
         System.out.println("Input for course-"+(i+1));
          course[i]=new Course();
          course[i].input_Course_code();
          course[i].input_Course_title();
          course[i].input_credit_hours();

        }
     
     // teacher assign course   
        for (int i = 0; i < t; i++) {
          tea[i].set_total_credit_hours(course[i].credit_hours); // sent credit hours
        }
     // enrolled student
        for (int i = 0; i < s; i++) {
            std[i].set_enrolled_Course(course[i]); // sent course details information
            course[i].set_enrollted_std();  // increase the number of enrolled student
        }
      
       // print information of student
        System.out.println("Print information of studnet:");
        for (int i = 0; i < s; i++) {
          std[i].print_Name();
          std[i].print_student_id();
          std[i].print_Department();
          std[i].print_Age();
          std[i].print_enrolled_Course();
        }
        
        // print information of teachers
        System.out.println("Print information of teacher:");
        for (int i = 0; i < t; i++) {
          tea[i].print_Name();
          tea[i].print_Employee_id();
          tea[i].print_Department();
          tea[i].print_Age();
          tea[i].print_total_credit_hours();
          tea[i].print_yearly_salary();
        }
        
         // print information of Course
        System.out.println("Print information of Course:");
        for (int i = 0; i < c; i++) {
          course[i].print_Course_code();
          course[i].print_Course_title();
          course[i].print_enrolled_std();
        }
        
    }
}
