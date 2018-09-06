package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.macosx.DiffMergeReporter;
import org.junit.Test;

@UseReporter(DiffMergeReporter.class)
public class GildedRoseTest {

    @Test
    public void foo() throws Exception {
        String[] names = {"foo","Aged Brie","Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros", null, ""};
        Integer[] qualities = {-1,0,1, 49,50,51, Integer.MAX_VALUE, Integer.MIN_VALUE};
        Integer[] sellIns ={-1,0,1,2,3,4,5,6,7,8,9,10,11,12, Integer.MAX_VALUE, Integer.MIN_VALUE};
		CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities, sellIns);
    }

	public String doStuff(String name, Integer quality, Integer sellIn) {
		Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        String result ="" +app.items[0];
		return result;
	}
}