package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import example.training.model.department.DepartmentList;
import example.training.model.employee.Employee;
import example.training.service.department.DepartmentService;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/modify/{employeeId:\\d+}")
public class EmployeeModifyController {

	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private EmployeeService employeeService;

	@ModelAttribute
	public Employee employee(@PathVariable Integer employeeId) {
		return employeeService.findById(employeeId);
	}

	@ModelAttribute
	public DepartmentList DepartmentList() {
		return departmentService.listOf();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "employee/modify/form";
	}

	@RequestMapping(path="back", method = RequestMethod.POST)
	public String backFrom(@ModelAttribute Employee employee,
			RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("employee", employee);
		return "redirect:/employee/modify/" + employee.getId().getValue();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String confirm(@Validated @ModelAttribute Employee employee,
			BindingResult result,
			Model model) {
		if(result.hasErrors())
			return "employee/modify/form";
		return "employee/modify/confirm";
	}

	@RequestMapping(path="execute",method = RequestMethod.POST)
	public String modify(@ModelAttribute Employee employee) {
		employeeService.modify(employee);
		return "redirect:/employee/" + employee.getId().getValue();
	}
}
