package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.model.employee.EmployeeFactory;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/register")
@SessionAttributes( value="employee" )
public class EmployeeRegisterController {

	@Autowired
	private EmployeeFactory employeeFactory;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public String form(Model model) {
		Employee employee = employeeFactory.create();
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("employee", employee);
		model.addAttribute("departmentList", departmentList);
		return "employee/register/form";
	}

	@GetMapping("back")
	public String backForm(Employee employee,
			Model model) {
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("departmentList", departmentList);
		return "employee/register/form";
	}

	@PostMapping
	public String confirm(@Validated @ModelAttribute Employee employee,
			BindingResult result,
			Model model) {
		DepartmentList departmentList = departmentService.listOf();
		model.addAttribute("departmentList", departmentList);
		if(result.hasErrors())
			return "employee/register/form";
		return "employee/register/confirm";
	}

	@PostMapping("execute")
	public String register(Employee employee,
			SessionStatus sessionStatus) {
		employeeService.register(employee);
		sessionStatus.setComplete();
		return "redirect:/employee";
	}
}
