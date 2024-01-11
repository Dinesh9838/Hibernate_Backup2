 package Hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "ducat_emp")
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@Data
public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + ", salary=" + salary + "]";
	}
	@Column(name="userName")
	private String name;
	private String gender;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
}
