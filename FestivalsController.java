package br.com.carlosjunior.registrationlogin.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.carlosjunior.registrationlogin.entities.Festivals;
import br.com.carlosjunior.registrationlogin.services.FestivalsInterface;

@Controller
public class FestivalsController
{
  
  private FestivalsInterface FestivalsService;
  
  public FestivalsController(FestivalsInterface FestivalsService) {
    super();
    this.FestivalsService = FestivalsService;
  }
  
  @GetMapping("/displayfestivals")
  public String listeducates(Model model)
  {
    model.addAttribute("festivals", FestivalsService.getAllapllies());
    return "festivals";
    
  }
 
  
   
  @PostMapping("/festivals")
  public String saverecord(@ModelAttribute("festivals") Festivals ed)
  {
    FestivalsService.saveStudent(ed);
    return "redirect:/";
  }
  
  
  
  
  @GetMapping("/festivals/new")
  public String createstudenform(Model model)  
  {
    Festivals ed=new Festivals();
    model.addAttribute("festivals",ed);
    return "festivalsnew";
  }

}