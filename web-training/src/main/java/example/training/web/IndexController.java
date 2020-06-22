package example.training.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {

	@GetMapping
	public String index(Model model) {
		model.addAttribute("locale", Locale.getDefault());
		return "index";
	}

	@GetMapping("greeting")
	public String greeting(
			Model model
			) {
		return "greeting";
	}

	@PostMapping("greeting")
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
