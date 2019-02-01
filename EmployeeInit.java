/*package ru.ncedu.java.tasks;*/

public class EmployeeImpl {
	
	private String FirstName;
	private String LastName;
	private int Salary = 1000;
	private EmployeeImpl Manager;
	private String TopManager;
	
	public String getFirstName() {
		System.out.println("Имя:" + FirstName);
		return FirstName;
	}
	
	public void setFirstName(String name) {
		FirstName = name;
	}
	
	public String getLastName() {
		System.out.println("Фамилия:" + LastName);
		return LastName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public void getFullName(){
		System.out.println("Полное имя:" + FirstName + " " + LastName);
	}
	
	public int getSalary(){
		System.out.println("Зарплата:" + Salary);
		return Salary;
	}
	
	public void increaseSalary(int value){
		Salary = Salary + value;
	}
	
	public void getManagerName(){
		if (Manager.FirstName instanceof String) {
			System.out.println(Manager.FirstName + " " + Manager.LastName);
		} else {
			System.out.println("No manager");
		}		
	}
	
	
    
    public String getTopManager(){
		if (TopManager instanceof String) {
			System.out.println("Имя топ-менеджера" + TopManager);
			return TopManager;
		} else {
			System.out.println("Имя топ-менеджера:" + FirstName + " " + LastName);
			return ""; 
		}
	}

     public static void main(String[] args) {
         EmployeeImpl E1 = new EmployeeImpl();
         E1.Manager = new EmployeeImpl();
         E1.setFirstName("AAAA");
     	 E1.getFirstName();
     	 E1.getLastName();
     	 E1.getFullName();
     	 E1.getSalary();
     	 E1.getTopManager();
     	 E1.getManagerName();
     	
     }


}