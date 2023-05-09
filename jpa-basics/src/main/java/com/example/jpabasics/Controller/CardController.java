package com.example.jpabasics.Controller;

import com.example.jpabasics.Entity.Card;
import com.example.jpabasics.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;

    @PostMapping("/add")
    public String addCard(@RequestBody Card card){
        return cardService.addCard(card);
    }

}
