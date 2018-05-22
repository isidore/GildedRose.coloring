package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.macosx.DiffMergeReporter;
import org.junit.Test;

@UseReporter(DiffMergeReporter.class)
public class GildedRoseTest {

	@Test
	public void foo() throws Exception {
		String[] names = { "names", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert",
				"Sulfuras, Hand of Ragnaros" };
		Integer[] sellIns = Range.get(-1, 15);
		Integer[] qualities = { 0, -1, 1, 49, 50, 51 };
		CombinationApprovals.verifyAllCombinations(this::doStuff, names, sellIns, qualities);
	}

	public String doStuff(String name, Integer sellIn, Integer quality) {
		Item[] items = { new Item(name, sellIn, quality) };
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		// Δ
		Item item = gildedRose.items[0];
		return String.format("name: %s sellin: %s d %s qualtity: %s d %s", item.name, item.sellIn, item.sellIn - sellIn,
				item.quality, item.quality - quality);
	}

}
