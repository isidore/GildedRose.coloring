package com.gildedrose;

import java.text.MessageFormat;
import java.util.Arrays;

class GildedRose {
	@Override
	public String toString() {
		return MessageFormat.format("GildedRose {0}", Arrays.toString(items));
	}

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			updateQualityForItem(item);
		}
	}

	public void updateQualityForItem(Item item) {
		if (item.name.equals("Aged Brie")) {

			updateQualityForAgedBrie(item);
			return;
		} else {

			updateEverythingElse(item);

		}
	}

	public void updateEverythingElse(Item item) {
		if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			if (item.quality > 0) {
				if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
					item.quality = item.quality - 1;
				}
			}
		} else {
			if (item.quality < 50) {
				item.quality = item.quality + 1;

				if (item.sellIn < 11 && item.quality < 50) {
					item.quality = item.quality + 1;
				}

				if (item.sellIn < 6 && item.quality < 50) {
					item.quality = item.quality + 1;
				}

			}
		}

		if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
			item.sellIn = item.sellIn - 1;
		}

		if (item.sellIn < 0) {
			if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item.quality > 0) {
					if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
						item.quality = item.quality - 1;
					}
				}
			} else {
				item.quality = item.quality - item.quality;
			}
		}
	}

	public void updateQualityForAgedBrie(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;

			if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

			}
		}

		item.sellIn = item.sellIn - 1;

		if (item.sellIn < 0 && item.quality < 50) {
			item.quality = item.quality + 1;
		}
	}
}