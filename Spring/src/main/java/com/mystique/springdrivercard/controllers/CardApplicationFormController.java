package com.mystique.springdrivercard.controllers;

import com.mystique.springdrivercard.models.CardApplicationForm;
import com.mystique.springdrivercard.services.cardApplicationFormService.CardApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class CardApplicationFormController {
    private CardApplicationService service;

    @Autowired
    public CardApplicationFormController(CardApplicationService cardApplicationService) {
        this.service = cardApplicationService;
    }

    @PostMapping("/new")
    public void addCardApplicationForm(@RequestBody CardApplicationForm cardApplicationForm) {
        service.addCardApplicationForm(cardApplicationForm);
    }

    @GetMapping
    public List<CardApplicationForm> getAllCardApplications() {
        return service.getAllCardApplications();
    }

    @GetMapping("/{id}")
    public CardApplicationForm getCardApplicationByID(@PathVariable int id) {
        return service.getCardApplicationByID(id);
    }

    @PutMapping("/{id}")
    public void updateCardApplication(@PathVariable int id,
                                      @RequestBody CardApplicationForm cardApplicationForm) {
        service.updateCardApplication(id, cardApplicationForm);
    }
}
