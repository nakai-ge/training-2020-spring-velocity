package example.training.model.department;

public class DepartmentName {

	private String value;

	public DepartmentName(String value) {
		super();
		this.value = value;
	}

	public DepartmentName() {
		this.value = "";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("DepartmentName [value=%s]", value);
	}
}
