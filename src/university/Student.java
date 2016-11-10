package university;

public class Student extends Person{
  protected String std_id;  
  Course[] enrolled_Course;
  private static int counter;
  Student(int noOfTakenCourse){
      enrolled_Course=new Course[noOfTakenCourse];
      counter=0;
  }
  // add course
protected void set_enrolled_Course(Course c){
    enrolled_Course[counter++]=c;
}
protected Course[] get_enrolled_Course(){
  return enrolled_Course;
}
protected void print_enrolled_Course(){
    System.out.print("enrolled_Course: ");
    for (int i = 0; i < enrolled_Course.length; i++) {
        if(enrolled_Course[i] !=null )
          System.out.println(": "+enrolled_Course[i].Course_code+"-"+enrolled_Course[i].Course_title);
    }
} 

  //basic method
  protected void input_std_id(){
  System.out.print("input_student_id: ");
  std_id= input.next();
 }
 protected String get_student_id(){
   return std_id;
 }
 protected void print_student_id(){
     System.out.println("Student_id is: "+ std_id);
 }
 
}
