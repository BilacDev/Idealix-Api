package br.com.idealix.idealix.controller;

import br.com.idealix.idealix.domain.Responsible;
import br.com.idealix.idealix.service.ResponsibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResponsibleController {

    @Autowired
    private ResponsibleService responsibleService;

    @RequestMapping(value = "/responsible", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Responsible> getResponsible() {
        return responsibleService.getResponsible();
    }

    @RequestMapping(value = "/responsible/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Responsible getResponsible(@PathVariable Long id) {
        return responsibleService.getResponsible(id);
    }

    @RequestMapping(value = "/responsible/create-responsible", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Responsible createResponsible(@RequestBody Responsible responsible) {
        return responsibleService.saveResponsible(responsible);
    }

    @RequestMapping(value = "/responsible/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteResponsible(@PathVariable Long id) {
        responsibleService.deleteResponsible(id);
    }

//    @RequestMapping(value = "/responsible/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public void editResponsible(@RequestBody Responsible responsible) {
//        responsibleService.editResponsible(responsible);
//    }

//    @RequestMapping(value = "/responsible/edit/{id}", method = RequestMethod.PUT)
//    public Responsible editResponsible(@PathVariable("id") Long id, Model model) {
//        System.out.println(id);
//        Responsible responsible = responsibleService.getResponsible(id);
//        model.addAttribute("responsible", responsible);
//
//        return responsibleService.saveResponsible(responsible);
//    }
//
//    @RequestMapping("/update")
//    public String update(Responsible responsible) {
//        responsibleService.saveResponsible(responsible);
//        return "redirect:listarpessoas";
//    }
}
