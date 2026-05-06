package com.example.samdiclass1.item;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forge")
@RequiredArgsConstructor
public class ForgeController {
    private final ForgeService forgeService;

    @PostMapping
    public void createItem(@RequestBody CreateItemRequest request) {
        forgeService.creamItem(request);
    }
}
