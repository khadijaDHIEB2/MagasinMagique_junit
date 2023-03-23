package com.magasin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void updateQuality() {
        Item[] items = new Item[] { new Item("Kryptonite", 0, 80) ,new Item("Pass VIP Concert", 0, 40),new Item("Comté", 10, 15),new Item("foo", 10, 20) };
        Magasin target = new Magasin(items);
        target.updateQuality();
        assertEquals( new Item[] { new Item("Kryptonite", 0, 80) , new Item("Pass VIP Concert", -1, 0),new Item("Comté", 9, 16),new Item("foo", 9, 19)}, items);
    }
}
