package org.david.galley.backend.controller;


import lombok.RequiredArgsConstructor;
import org.david.galley.backend.entity.Item;
import org.david.galley.backend.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Item> getItem(){

        List<Item> items = itemRepository.findAll();

        return items;

    }
}
