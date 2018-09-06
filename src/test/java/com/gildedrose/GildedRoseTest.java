package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.approvaltests.reporters.macosx.DiffMergeReporter;
import org.junit.Test;

@UseReporter(DiffMergeReporter.class)
public class GildedRoseTest {

    @Test
    public void foo() {
        String result = doStuff("foo");
		Approvals.verify(result);
		return;
    }

	public String doStuff(String name) {
		Item[] items = new Item[] { new Item(name, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        String result ="" +app.items[0];
		return result;
	}
}