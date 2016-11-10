
package university;

public class Teacher extends Person{
    protected String Employee_id;
    protected double monthly_Salary;
    protected int total_credit_hours;
    private final double interest_rate=0.1;
    private double yearly_salary;
    Teacher(){
        total_credit_hours=0;
    }
 
// add student
protected void set_total_credit_hours(int n){
 total_credit_hours+=n;
}

protected int get_enrolled_std(){
return total_credit_hours;
}
protected void print_total_credit_hours(){
 System.out.println("total_credit_hours: "+total_credit_hours);
}

protected void set_yearly_salary(){
 yearly_salary=(monthly_Salary*12)*interest_rate+(monthly_Salary*12);
}

protected double get_yearly_salary(){
return yearly_salary;
}
protected void print_yearly_salary(){
 System.out.println("yearly_salary: "+yearly_salary);
}


//bacic method
 protected void input_Employee_id(){
  System.out.print("input_Employee_id: ");
  Employee_id= input.next();
 }
 protected String get_Employee_id(){
   return Employee_id;
 }
 protected void print_Employee_id(){
     System.out.println("Employee_id is: "+ Employee_id);
 }
 
 protected void input_monthly_Salary(){
  System.out.print("input_monthly_Salary: ");
  monthly_Salary= input.nextDouble();
 }
 protected double get_monthly_Salary(){
   return monthly_Salary;
 }
 protected void print_monthly_Salary(){
     System.out.println("monthly_Salary is: "+ monthly_Salary);
 }
}
