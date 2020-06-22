package example.training.datasource.employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeId;
import example.training.model.employee.criteria.EmployeeListCriteria;

@Mapper
public interface EmployeeMapper {
	Employee findById(@Param("employeeId") Integer employeeId);
	List<Employee> listOf();
	List<Employee> listOfCriteria(@Param("criteria") EmployeeListCriteria criteria);
	EmployeeId nextId();
	void register(@Param("employeeId") EmployeeId employeeId , @Param("employee") Employee employee);
	void modify(@Param("employee") Employee employee);
	void delete(@Param("employeeId") Integer employeeId);
}
