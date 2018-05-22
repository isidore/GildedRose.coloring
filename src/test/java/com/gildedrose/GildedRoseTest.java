package com.gildedrose;

import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.macosx.DiffMergeReporter;
import org.junit.Test;

@UseReporter(DiffMergeReporter.class)
public class GildedRoseTest {

	@Test
	public void foo() throws Exception {

	}

	public String doStuff(String name, Integer sellIn, Integer quality) {
		Item[] items = { new Item(name, sellIn, quality) };
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		// Δ
		return String.format("%s", gildedRose);
	}

}
