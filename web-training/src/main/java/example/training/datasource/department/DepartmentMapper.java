package example.training.datasource.department;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import example.training.model.department.Department;

@Mapper
public interface DepartmentMapper {
	List<Department> listOf();
}
