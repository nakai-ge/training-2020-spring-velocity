package example.training.model.employee;

import org.apache.ibatis.annotations.Param;

import example.training.model.employee.criteria.EmployeeListCriteria;

public interface EmployeeRepository {
	public Employee findById(Integer employeeId);
	public EmployeeList listOf(EmployeeListCriteria criteria);
	public void register(Employee employee);
	public void modify(Employee employee);
	public void delete(@Param("employeeId") Integer employeeId);
}
