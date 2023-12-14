class User{
    int id;
    String name;
    
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
}

class Employee extends User{
    double salary;
    
    public Employee(int id,String name,double salary){
        super(id,name);
        this.salary = salary;
    }
    
    public double calculateAnnualSalary(){
        return salary * 12;
    }
}


public class Question3
{
	public static void main(String[] args) {
	   Employee emp1 = new Employee(1 ,"john salary", 20000);
	   System.out.println("Id -> "+emp1.id);
	   System.out.println("Name -> "+ emp1.name);
	   System.out.println("Salary -> "+emp1.salary);
	   double annualSalary = emp1.calculateAnnualSalary();
	   System.out.println("Annual Salary -> "+annualSalary);
	}
}
