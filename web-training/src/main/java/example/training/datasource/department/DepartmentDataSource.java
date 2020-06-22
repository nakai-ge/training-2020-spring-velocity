package example.training.datasource.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.department.Department;
import example.training.model.department.DepartmentList;
import example.training.model.department.DepartmentRepository;

@Repository
public class DepartmentDataSource implements DepartmentRepository {

	@Autowired
	private DepartmentMapper mapper;

	@Override
	public DepartmentList listOf() {
		List<Department> list = mapper.listOf();
		return new DepartmentList(list);
	}
}
