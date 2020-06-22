package example.training.service.employee;

import org.apache.ibatis.annotations.Param;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.criteria.EmployeeListCriteria;

public interface EmployeeService {
	public Employee findById(Integer employeeId);
	public EmployeeList listOf(EmployeeListCriteria criteria);
	public void register(Employee employee);
	public void modify(Employee employee);
	public void delete(@Param("employeeId") Integer employeeId);
}
