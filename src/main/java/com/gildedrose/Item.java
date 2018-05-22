package com.gildedrose;

import java.text.MessageFormat;

public class Item {

	@Override
	public String toString() {
		return MessageFormat.format("(name={0}, sellIn={1}, quality={2})", name, sellIn, quality);
	}

	public String name;

	public int sellIn;

	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

}
