package example.training.model.employee;

import java.io.Serializable;

import javax.validation.Valid;

import example.training.model.fandamental.DateOfBirth;
import example.training.model.fandamental.Gender;

public class Employee implements Serializable {

	private static final long serialVersionUID = 4452675527231791966L;

	private EmployeeId id;

	@Valid
	private EmployeeName name;

	private Gender gender;

	@Valid
	private DateOfBirth dateOfBirth;

	@Valid
	private EmployeeDepartment department;

	public Employee(EmployeeId id,
			EmployeeName name,
			Gender gender,
			DateOfBirth dateOfBirth,
			EmployeeDepartment department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
	}

	public Employee() {
		this.id = new EmployeeId();
		this.name = new EmployeeName();
		this.gender = Gender.MALE;
		this.dateOfBirth = new DateOfBirth();
		this.department = new EmployeeDepartment();
	}

	public EmployeeId getId() {
		return id;
	}

	public EmployeeName getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public EmployeeDepartment getDepartment() {
		return department;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, gender=%s, dateOfBirth=%s, department=%s]",
				id, name, gender, dateOfBirth, department);
	}
}
