package example.training.model.employee.criteria;

import example.training.model.department.DepartmentId;

public class EmployeeListCriteria {

	private DepartmentId selectedDepartmentId;
	private EmployeeIdPriority employeeIdPriority;

	public EmployeeListCriteria() {
		this.selectedDepartmentId = new DepartmentId();
		this.employeeIdPriority = EmployeeIdPriority.ASC;
	}

	public DepartmentId getSelectedDepartmentId() {
		return selectedDepartmentId;
	}

	public EmployeeIdPriority getEmployeeIdPriority() {
		return employeeIdPriority;
	}


	public void setSelectedDepartmentId(DepartmentId selectedDepartmentId) {
		this.selectedDepartmentId = selectedDepartmentId;
	}


	public void setEmployeeIdPriority(EmployeeIdPriority employeeIdPriority) {
		this.employeeIdPriority = employeeIdPriority;
	}


	@Override
	public String toString() {
		return String.format("EmployeeListCriteria [selectedDepartmentId=%s]", selectedDepartmentId);
	}
}
