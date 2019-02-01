package ru.ncedu.java.tasks;

public class EmployeeImpl implements Employee {
	
	private String FirstName;
	private String LastName;
	private Int Salary = 1000;
	private Employee Manager;
	private String TopManager;
	
	public String getFirstName(){
		return FirstName;
	}
	
	public void setFirstName(string name) {
		FirstName = name;
	}
	
	public String getLastName(){
		return LastName;
	}
	
	public void setLastName(string LastName){
		this.LastName = LastName;
	}
	
	public String getFullName(){
		System.out.println(FirstName, " ", LastName);
	}
	
	public int getSalary(){
		return Salary;
	}
	
	public void increaseSalary(int value){
		Salary = Salary + value;
	}
	
	public String getManagerName(){
		if (Manager.FirstName instanceof String) {
			System.out.println(Manager.FirstName, " ", Manager.LastName);
		} else {
			System.out.println("No manager");
		}		
	}
	
	public String getTopManager(){
		if (TopManager instanceof String) {
			return TopManager;
		} else {
			System.out.println(FirstName, " ", LastName);
		}
	}
}
	


public interface Employee {
	/**
	 * @return Зарплата сотрудника на настоящий момент.
	 */
	int getSalary();

	/**
	 * Увеличивает зарплату сотрудника на заданное значение
	 * @param value Значение, на которое нужно увеличить
	 */
	public void increaseSalary(int value);

	/**
	 * @return Имя сотрудника
	 */
	public String getFirstName();

	/**
	 * Устанавливает Имя сотрудника
	 * @param firstName Новое имя
	 */
	public void setFirstName(String firstName);

	/**
	 * @return Фамилию сотрудника
	 */
	public String getLastName();

	/**
	 * Устанавливает Фамилию сотрудника
	 * @param lastName Новая фамилия
	 */
	public void setLastName(String lastName);

	/**
	 * @return Имя и Фамилию сотрудника, разделенные символом " " (пробел)
	 */
	public String getFullName();

	/**
	 * Устанавливает Менеджера сотрудника
	 * @param manager Объект, соответствующий Менеджеру
	 */
	public void setManager(Employee manager);

	/**
	 * Возвращает Имя и Фамилию Менеджера, разделенные символом " " (пробел).
	 * Если Менеджер не задан, возвращает строку "No manager".
	 */
	public String getManagerName();

	/**
	 * Возвращает Менеджера верхнего уровня, т.е. вершину иерархии сотрудников, 
	 *   в которую входит данный сотрудник.
	 * Если над данным сотрудником нет ни одного менеджера, возвращает данного сотрудника.
	 */
	public Employee getTopManager();
}


