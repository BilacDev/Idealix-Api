package br.com.idealix.idealix.controller;

import br.com.idealix.idealix.domain.Classification;
import br.com.idealix.idealix.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClassificationController {

    @Autowired
    private ClassificationService classificationService;

    @RequestMapping(value = "/classification", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Classification> getClassification() {
        return classificationService.getClassification();
    }

    @RequestMapping(value = "/classification/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Classification getClassification(@PathVariable Long id) {
        return classificationService.getClassification(id);
    }

    @RequestMapping(value = "/classification/create-classification", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Classification createClassification(@RequestBody Classification classification) {
        return classificationService.saveClassification(classification);
    }

    @RequestMapping(value = "/classification/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteClassification(@PathVariable Long id) {
        classificationService.deleteClassification(id);
    }
}
