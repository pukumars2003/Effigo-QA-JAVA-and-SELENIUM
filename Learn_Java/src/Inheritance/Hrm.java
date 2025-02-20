package Inheritance;

public class Hrm extends Employee {
	
	public Hrm(int salary) {
		super(salary);
	}
	static void Hello() {
		System.out.println("Directly Acces of the static method without object");
	}
	
	public void work() {
		System.out.println("Managing");
	}
	public void addEmployee() {
        System.out.println("\nAdding new employee!");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(70000);
		Hrm hr=new Hrm(50000);
		/*hr.work();*/
		Hello();
		//System.out.println("Employee Sallary "+emp.getSalary());
	}

}
