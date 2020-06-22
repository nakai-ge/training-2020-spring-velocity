package example.training.model.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	private List<Employee> values;

	public EmployeeList(List<Employee> values) {
		super();
		this.values = values;
	}

	public EmployeeList() {
		this.values = new ArrayList<Employee>();
	}

	public List<Employee> getValues() {
		return values;
	}

	public void setValues(List<Employee> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return String.format("EmployeeList [values=%s]", values);
	}
}
