package example.training.model.employee;

import javax.validation.Valid;

import example.training.model.department.DepartmentId;
import example.training.model.department.DepartmentName;

public class EmployeeDepartment {
	@Valid
	private DepartmentId id;
	private DepartmentName name;

	public EmployeeDepartment(DepartmentId id, DepartmentName name) {
		super();
		this.id = id;
		this.name = name;
	}

	public EmployeeDepartment() {
		this.id = new DepartmentId();
		this.name = new DepartmentName();
	}

	public DepartmentId getId() {
		return id;
	}

	public DepartmentName getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("EmployeeDepartment [id=%s, name=%s]", id, name);
	}
}
