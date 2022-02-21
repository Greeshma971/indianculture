package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Education;
import br.com.carlosjunior.registrationlogin.services.EducationInterface;

@Controller
public class EducationController
{
  
  private EducationInterface educationService;
  
  public EducationController(EducationInterface educationService) {
    super();
    this.educationService = educationService;
  }
  
  @GetMapping("/educate")
  public String listeducates(Model model)
  {
    model.addAttribute("educate", educationService.getAlleducates());
    return "displayfile";
    
  }
 
  
   
  @PostMapping("/educate")
  public String saverecord(@ModelAttribute("educate") Education ed)
  {
    educationService.saveStudent(ed);
    return "redirect:/educate";
  }
  
  
  
  
  @GetMapping("/educate/new")
  public String createstudenform(Model model)  
  {
    Education ed=new Education();
    model.addAttribute("educate",ed);
    return "addedu";
  }

}