package com.gildedrose;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			updateQuality(i, item);
		}
	}

	public void updateQuality(int i, Item item) {
		Item item2 = items[i];
		if (item.name.equals("Aged Brie")) {

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
		if (item2.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			if ( !item2.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item2.quality > 0) {
					if (!item2.name.equals("Sulfuras, Hand of Ragnaros")) {
						item2.quality = item2.quality - 1;
					}
				}
			} else {
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
			}
			
			if (!item2.name.equals("Sulfuras, Hand of Ragnaros")) {
				item2.sellIn = item2.sellIn - 1;
			}
			
			if (item2.sellIn < 0) {
				if (!item2.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
					if (item2.quality > 0) {
						if (!item2.name.equals("Sulfuras, Hand of Ragnaros")) {
							item2.quality = item2.quality - 1;
						}
					}
				} else {
					item2.quality = item2.quality - item2.quality;
				}
			}
			return;
			
		} else {

			if ( !item2.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item2.quality > 0) {
					if (!item2.name.equals("Sulfuras, Hand of Ragnaros")) {
						item2.quality = item2.quality - 1;
					}
				}
			} else {
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
			}
			
			if (!item2.name.equals("Sulfuras, Hand of Ragnaros")) {
				item2.sellIn = item2.sellIn - 1;
			}
			
			if (item2.sellIn < 0) {
				if (!item2.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
					if (item2.quality > 0) {
						if (!item2.name.equals("Sulfuras, Hand of Ragnaros")) {
							item2.quality = item2.quality - 1;
						}
					}
				} else {
					item2.quality = item2.quality - item2.quality;
				}
			}
			return;
		}
	}
}