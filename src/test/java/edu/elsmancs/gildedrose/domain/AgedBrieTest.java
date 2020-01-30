package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.Item;

public class AgedBrieTest {

    @Test
    public void crearItem() {

        AgedBrie item = new AgedBrie("Aged Brie", 10, 20);

        assertEquals("Aged Brie", item.getName());
        assertEquals(10, item.getSell_in(), 0);
        assertEquals(20, item.getQuality(), 0);
        System.out.println(item);
    }

    @Test
    public void updateQualityAgedBrie() {

        AgedBrie aged = new AgedBrie("AgedBrie", 10, 20);
        aged.updateQuality();
        assertEquals(9, aged.getSell_in(), 0);
        assertEquals(21, aged.getQuality(), 0);
    }
}