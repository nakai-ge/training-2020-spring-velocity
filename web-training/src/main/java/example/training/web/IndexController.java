package example.training.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("locale", Locale.getDefault());
		return "index";
	}

	@RequestMapping(path="greeting", method = RequestMethod.GET)
	public String greeting(
			Model model
			) {
		return "greeting";
	}

	@RequestMapping(path="greeting", method = RequestMethod.POST)
	public String greeting(
			@ModelAttribute("firstName") String firstName,
			@ModelAttribute("lastName") String lastName,
			Model model
			) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return "greeting";
	}
}
