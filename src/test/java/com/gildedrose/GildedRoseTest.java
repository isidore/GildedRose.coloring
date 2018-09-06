package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.macosx.DiffMergeReporter;
import org.junit.Test;

@UseReporter(DiffMergeReporter.class)
public class GildedRoseTest {

    @Test
    public void foo() throws Exception {
        String[] names = {"foo","Aged Brie","Backstage passes to a TAFKAL80ETC concert"};
		CombinationApprovals.verifyAllCombinations(this::doStuff, names);
    }

	public String doStuff(String name) {
		Item[] items = new Item[] { new Item(name, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        String result ="" +app.items[0];
		return result;
	}
}