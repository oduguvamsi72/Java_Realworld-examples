package javaproject;

class emp {
	private int id;
	private String name;
	private String email;
	private Double salary;

//	allargsconstructer
	public emp(int id, String name, String email, Double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.setSalary(salary);
	}

	public int getid() {
		return id;

	}

	public String getname() {
		return name;

	}

	public String getemail() {
		return email;

	}

	public Double getSalary() {
		return salary;
	}

	public void setid(int id) {
		this.id = id;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public emp() {
		super();
	}

	public void updatesalary(Double newsalary) {
		if (newsalary > 0) {
			this.salary = newsalary;
			System.out.println("updated salary is:" + newsalary);
		} else {
			System.out.println("Invalid salary.");
		}
	}

}

class HRdepart {
	public void incsalary(emp e, Double newsalary) {
		e.updatesalary(newsalary);
	}
}

public class encapsulation {
public static void main(String[] args) {
	emp e=new emp(2001,"vamsi","vamsi@gmail.com",24000.0);
System.out.println("employee name:"+e.getname());
System.out.println("employee email:"+e.getemail());
System.out.println("employee salary:"+e.getSalary());
HRdepart hr=new HRdepart();
hr.incsalary(e,5000.0);
System.out.println("updated salary is:"+e.getSalary());
}
}
