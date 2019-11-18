package br.com.idealix.idealix.controller;

import br.com.idealix.idealix.domain.History;
import br.com.idealix.idealix.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @RequestMapping(value = "/history", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<History> getHistory() {
        return historyService.getHistory();
    }

    @RequestMapping(value = "/history/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public History getHistory(@PathVariable Long id) {
        return historyService.getHistory(id);
    }

    @RequestMapping(value = "/history/create-history", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public History createHistory(@RequestBody History history) {
        return historyService.saveHistory(history);
    }
}
