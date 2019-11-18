package br.com.idealix.idealix.controller;

import br.com.idealix.idealix.service.ChildService;
import br.com.idealix.idealix.domain.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChildController {

    @Autowired
    private ChildService childService;

    @RequestMapping(value = "/child", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Child> getChild() {
        return childService.getChild();
    }

    @RequestMapping(value = "/child/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Child getChild(@PathVariable Long id) {
        return childService.getChild(id);
    }

    @RequestMapping(value = "/child/create-child", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Child createChild(@RequestBody Child child) {
        return childService.saveChild(child);
    }

    @RequestMapping(value = "/child/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteChild(@PathVariable Long id) {
        childService.deleteChild(id);
    }
}
