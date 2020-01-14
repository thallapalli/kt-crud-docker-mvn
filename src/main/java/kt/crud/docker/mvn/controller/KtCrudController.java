package kt.crud.docker.mvn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KtCrudController {
	@GetMapping("/")
	public String hello() {
		return "All is well";
	}
}
