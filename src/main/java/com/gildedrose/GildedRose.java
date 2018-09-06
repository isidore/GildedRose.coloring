package com.gildedrose;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			Item item3 = item;
			Item item2 = item;
			if (item3.name.equals("Aged Brie")) {
			
				updateQualityForAgedBrie(item2);
			}
			else if (item2.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
				updateQualityForBackstagePasses(item2);
			
			}
			else if (item2.name.equals("Sulfuras, Hand of Ragnaros")) {
				updateQualityForSulfuras(item2);
			
			} else {
			
				updateQualityForDefaultItem(item2);
			}
		}
	}

	public void updateQualityForDefaultItem(Item item2) {
		if (item2.quality > 0) {
			item2.quality = item2.quality - 1;
		}

		item2.sellIn = item2.sellIn - 1;

		if (item2.sellIn < 0 && item2.quality > 0) {
			item2.quality = item2.quality - 1;
		}
		return;
	}

	private void updateQualityForSulfuras(Item item2) {
		// TODO Auto-generated method stub

	}

	public void updateQualityForBackstagePasses(Item item2) {
		if (item2.quality < 50) {
			item2.quality = item2.quality + 1;

			if (item2.sellIn < 11) {
				if (item2.quality < 50) {
					item2.quality = item2.quality + 1;
				}
			}

			if (item2.sellIn < 6) {
				if (item2.quality < 50) {
					item2.quality = item2.quality + 1;
				}
			}
		}

		item2.sellIn = item2.sellIn - 1;

		if (item2.sellIn < 0) {
			item2.quality = item2.quality - item2.quality;
		}
		return;
	}

	public void updateQualityForAgedBrie(Item item2) {
		if (item2.quality < 50) {
			item2.quality = item2.quality + 1;

			if (item2.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			}
		}

		item2.sellIn = item2.sellIn - 1;

		if (item2.sellIn < 0) {
			if (item2.quality < 50) {
				item2.quality = item2.quality + 1;
			}
		}
		return;
	}
}