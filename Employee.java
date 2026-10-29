class Employee
{
private int empId;
private String name;
private double baseSalary;
Employee(int empId,String name,double baseSalary)
{
this.empId = empId;
this.name = name;
this.baseSalary = baseSalary;
}
double calculateSalary()
{
return baseSalary;
}
double calculateSalary(double bonus)
{ 
return baseSalary + bonus;
}
double  calculateSalary(double bonus,double deductions)
{
return baseSalary + bonus - deductions;
}
void display()
{
System.out.println("EmpID:"+empId);
System.out.println("Name:"+name);
}
public static void main(String args[])
{
Employee emp1 = new Employee(101,"Ravi",30000);
Employee emp2 = new Employee(102,"Anitha",40000);
Employee emp3 = new Employee(103,"Kiran",50000);
emp1.display();
System.out.println("Final Payout: "+emp1.calculateSalary());
System.out.println();
emp2.display();
System.out.println("Final Payout: "+emp2.calculateSalary(5000));
System.out.println();
emp3.display();
System.out.println("Final Payout: "+emp3.calculateSalary(5000,3000));
}
}
