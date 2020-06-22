package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeList;
import example.training.model.employee.criteria.EmployeeListCriteria;
import example.training.model.employee.criteria.EmployeeListCriteriaFactory;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeSevice;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeListCriteriaFactory employeeListCriteriaFactory;

	@GetMapping
	public String employees(Model model) {
		EmployeeListCriteria criteria = employeeListCriteriaFactory.create();
		prepareEmployees(criteria, model);
		return "employee/employee-list";
	}

	@PostMapping
	public String employeesSearch(@ModelAttribute EmployeeListCriteria criteria,
			Model model) {
		prepareEmployees(criteria, model);
		return "employee/employee-list";
	}

	@GetMapping("{employeeId:\\d+}")
	public String employee(
			@PathVariable Integer employeeId,
			Model model) {
		Employee employee = employeeSevice.findById(employeeId);
		model.addAttribute("employee", employee);
		return "employee/employee";
	}

	private void prepareEmployees(EmployeeListCriteria criteria, Model model) {
		EmployeeList employeeList = employeeSevice.listOf(criteria);
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("criteria", criteria);
		model.addAttribute("employeelist", employeeList);
		model.addAttribute("departmentList", departmentList);
	}
}
