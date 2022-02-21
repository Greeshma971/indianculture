package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Applyedu;
import br.com.carlosjunior.registrationlogin.services.ApplyeduInterface;
 
@Controller
public class ApplyeduController
{
	
	private ApplyeduInterface applyeduService;
	
	public ApplyeduController(ApplyeduInterface applyeduService) {
		super();
		this.applyeduService= applyeduService;
	}
	
	@GetMapping("/apply")
	public String listeducates(Model model)
	{
		model.addAttribute("applyedu", applyeduService.getAllapllies());
		return "apply";
		
	}
 
	
	 
	@PostMapping("/applyedu")
	public String saverecord(@ModelAttribute("applyedu") Applyedu std)
	{
		applyeduService.saveStudent(std);
		return "redirect:/thankyou";
	}
	
	
	
	
	@GetMapping("/apply/new")
	public String createstudenform(Model model)	
	{
		 
		Applyedu ed=new Applyedu();
		model.addAttribute("applyedu",ed);
		return "createapply";
 	
	}

	@GetMapping("/thankyou")
	public String thanks(Model model)	
	{
 		return "thankyou";
 	
	}
	 

}
