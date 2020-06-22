package example.training.model.department;

public class Department {

	private DepartmentId id;
	private DepartmentName name;

	public Department(DepartmentId id, DepartmentName name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Department() {
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
		return String.format("Department [id=%s, name=%s]", id, name);
	}
}
