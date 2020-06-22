package example.training.model.department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentList {
	private List<Department> values;

	public DepartmentList(List<Department> values) {
		super();
		this.values = values;
	}

	public DepartmentList() {
		this.values = new ArrayList<Department>();
	}

	public DepartmentName departmentNameById(Integer departmentId) {
		for(Department department: values)
			if(department.getId().getValue().equals(departmentId))
				return department.getName();
		return new DepartmentName();
	}

	public List<Department> getValues() {
		return values;
	}

	public void setValues(List<Department> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return String.format("DepartmentList [values=%s]", values);
	}
}
