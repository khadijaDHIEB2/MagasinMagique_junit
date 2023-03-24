package com.magasin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

//    @Test
//    void foo() {
//        Item[] items = new Item[] { new Item("foo", 0, 0) };
//        Magasin app = new Magasin(items);
//        app.updateQuality();
//        assertEquals("fixme", app.items[0].name);
//    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void updateQualityGeneral() {
        Item[] items = new Item[] { new Item("Kryptonite", 0, 80) ,new Item("Pass VIP Concert", 0, 40),new Item("Comté", 10, 15),new Item("foo", 10, 20) , new Item("Magic product", 10, 15)};
        Magasin target = new Magasin(items);

        target.updateQuality();
        Item[] itemsExpected = new Item[] { new Item("Kryptonite", 0, 80) , new Item("Pass VIP Concert", -1, 0),new Item("Comté", 9, 16),new Item("foo", 9, 19),  new Item("Magic product", 9, 13)};
        for (int i = 0; i<5; i++){
            assertEquals( itemsExpected[i].toString(), items[i].toString());
        }
    }

    @Test
    void updateQualityPassVIP() {
        Item[] items = new Item[] { new Item("Pass VIP Concert", 12, 40)};
        Magasin target = new Magasin(items);
        for (int i = 0; i <15 ; i++) {
            target.updateQuality();
        }
        assertEquals( new Item("Pass VIP Concert", -3, 0).toString(), items[0].toString());
    }

    @Test
    void updateQualityKryptonite() {
        Item[] items = new Item[] { new Item("Kryptonite", 0, 80)};
        Magasin target = new Magasin(items);
        for (int i = 0; i <7 ; i++) {
            target.updateQuality();
        }
        assertEquals( new Item("Kryptonite", 0, 80).toString(), items[0].toString());
    }

    @Test
    void updateQualityComte() {
        Item[] items = new Item[] { new Item("Comté", 10, 15)};
        Magasin target = new Magasin(items);
        for (int i = 0; i <15 ; i++) {
            target.updateQuality();
        }
        assertEquals( new Item("Comté", -5, 35).toString(), items[0].toString());
    }

    @Test
    void updateQualityLamda() {
        Item[] items = new Item[] { new Item("foo", 10, 15)};
        Magasin target = new Magasin(items);
        for (int i = 0; i <15 ; i++) {
            target.updateQuality();
        }
        assertEquals( new Item("foo", -5, 0).toString(), items[0].toString());
    }

    @Test
    void updateQualityMagicProduct() {
        Item[] items = new Item[] { new Item("Magic product", 10, 15)};
        Magasin target = new Magasin(items);
        for (int i = 0; i <2 ; i++) {
            target.updateQuality();
        }
        assertEquals( new Item("Magic product", 8, 11).toString(), items[0].toString());
    }


}
