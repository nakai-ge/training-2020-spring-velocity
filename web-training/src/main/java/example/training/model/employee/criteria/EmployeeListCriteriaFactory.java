package example.training.model.employee.criteria;

import org.springframework.stereotype.Component;

@Component
public class EmployeeListCriteriaFactory {

	public EmployeeListCriteria create() {
		return new EmployeeListCriteria();
	}

}
