package example.training.datasource.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeId;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.EmployeeRepository;
import example.training.model.employee.criteria.EmployeeListCriteria;

@Repository
public class EmployeeDataSource implements EmployeeRepository {

	@Autowired
	private EmployeeMapper mapper;

	@Override
	public Employee findById( Integer employeeId ){
		return mapper.findById(employeeId);
	}

	@Override
	public EmployeeList listOf(EmployeeListCriteria criteria) {
		List<Employee> list = mapper.listOfCriteria(criteria);
		return new EmployeeList(list);
	}

	@Override
	public void register(Employee employee) {
		EmployeeId employeeId = mapper.nextId();
		mapper.register(employeeId,employee);
	}

	@Override
	public void modify(Employee employee) {
		mapper.modify(employee);
	}

	@Override
	public void delete(Integer employeeId) {
		mapper.delete(employeeId);
	}
}
