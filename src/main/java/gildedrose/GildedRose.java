package gildedrose;

import java.util.ArrayList;
class GildedRose {

    public static final int MAX_QUALITY = 50;
    ArrayList<ItemGlideRose> inventario = new ArrayList<ItemGlideRose>();

    ItemGlideRoseFactory itemFactory = new ItemGlideRoseFactory();

    public GildedRose(Item[] items) {
        ItemGlideRose itemGlideRose;

        for (Item item: items){
            itemGlideRose = itemFactory.createItem(item);
            inventario.add(itemGlideRose);
        }

    }

    public void updateQuality() {
        for (ItemGlideRose item : inventario) {
            item.updateQuality();
        }
    }
}