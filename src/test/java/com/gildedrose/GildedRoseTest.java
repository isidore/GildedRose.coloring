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
		String names[] = { "name", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert",
				"Sulfuras, Hand of Ragnaros", };
		Integer[] qualites = { 0, -1, 1, 49, 50, 51 };
		Integer[] sellIn = Range.get(-1, 15);
		CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualites, sellIn);
	}

	public GildedRose doStuff(String name, Integer quality, Integer sellIn) {
		Item[] items = { new Item(name, sellIn, quality) };
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		return gildedRose;
	}

}
