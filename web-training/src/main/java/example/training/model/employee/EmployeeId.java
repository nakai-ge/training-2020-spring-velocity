package example.training.model.employee;

public class EmployeeId {

	private Integer value;

	public EmployeeId(Integer value) {
		super();
		this.value = value;
	}

	public EmployeeId() {
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("EmployeeId [value=%s]", value);
	}
}
