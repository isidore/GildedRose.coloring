package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.macosx.DiffMergeReporter;
import org.junit.Test;

@UseReporter(DiffMergeReporter.class)
public class GildedRoseTest {

	@Test
	public void testStuff() throws Exception {
		String[] names = { "name", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert",
				"Sulfuras, Hand of Ragnaros", "", null };
		Integer[] qualities = { 0, -1, 1, 49, 50, 51, Integer.MAX_VALUE, Integer.MIN_VALUE };
		Integer[] sellIns = { -1, 1, 0, 10, 11, 12, 5, 6, 7, Integer.MAX_VALUE, Integer.MIN_VALUE };
		CombinationApprovals.verifyAllCombinations(this::doFoo, names, qualities, sellIns);
	}

	public String doFoo(String name, Integer quality, Integer sellIn) {
		Item item = new Item(name, sellIn, quality);
		Item[] items = { item };
		GildedRose rose = new GildedRose(items);
		rose.updateQuality();
		String string = rose.toString();
		return string;
	}

}
