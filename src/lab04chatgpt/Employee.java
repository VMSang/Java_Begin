package lab04chatgpt;

import java.util.Scanner;

public class Employee {
	private String name;
	private double salary;
	private String position;

	public Employee() {
//		default constructor
	}

	public Employee(String name, double salary, String position) {
		this.name = name;
		this.salary = salary;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Employee nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		double salary = scanner.nextDouble();
		scanner.nextLine();
		String position = scanner.nextLine();
		scanner.close();
		return new Employee(name, salary, position);
	}

	public void xuatThongtin(Employee outInfor) {
		System.out.println("ten nhan vien: " + outInfor.getName() + "   lương: " + outInfor.getSalary() + "   positon: "
				+ outInfor.getPosition());
	}

}
