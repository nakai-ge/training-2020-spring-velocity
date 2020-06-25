package example.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import example.training.model.employee.Employee;
import example.training.service.employee.EmployeeService;

@Controller
@RequestMapping("employee/delete")
public class EmployeeDeleteController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(path = "{employeeId:\\d+}", method = RequestMethod.GET)
	public String confirm(@PathVariable Integer employeeId,
			Model model) {
		Employee employee = employeeService.findById(employeeId);
		model.addAttribute("employee", employee);
		return "employee/delete/confirm";
	}

	@RequestMapping(path = "{employeeId:\\d+}/execute", method = RequestMethod.POST)
	public String delete(@PathVariable Integer employeeId) {
		employeeService.delete(employeeId);
		return "redirect:/employee";
	}
}
