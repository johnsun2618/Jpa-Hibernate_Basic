package com.example.jpabasics.Service;

import com.example.jpabasics.Entity.Card;
import com.example.jpabasics.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {


    @Autowired
    CardRepository cardRepository;

    public String addCard(Card card){
        cardRepository.save(card);
        return "Card Added";
    }


}
