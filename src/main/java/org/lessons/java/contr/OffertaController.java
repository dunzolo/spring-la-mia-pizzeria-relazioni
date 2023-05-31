package org.lessons.java.contr;

import org.lessons.java.pojo.OffertaSpeciale;
import org.lessons.java.serv.OffertaSpecialeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OffertaController {
	
	@Autowired
	private OffertaSpecialeService offertaSpecialeService;

	@GetMapping("/offerta/create")
	public String createOfferta(Model model) {
		
		model.addAttribute("offerta", new OffertaSpeciale());
		
		return "create-offerta";
	}
}
