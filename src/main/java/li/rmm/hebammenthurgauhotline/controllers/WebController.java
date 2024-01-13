package li.rmm.hebammenthurgauhotline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class WebController {

	@GetMapping("/")
	public String viewIndexPage() {
		return "index";
	}
}
