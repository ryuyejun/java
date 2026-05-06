package com.example.samdiclass1.item;

public record CreateItemRequest (
        String name,
        String type,
        int attackPower,
        int durability
) {
}
