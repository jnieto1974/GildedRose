package gildedrose;


public class ItemFactory {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURADO = "Conjurados";

    public static ItemGlideRose createItem(Item item) {
        if (item.name.equals(AGED_BRIE)){
            return new AgedBrie(item);
        } else if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
            return new BackstagePasses(item);
        } else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            return new Sulfuras(item);
        } else if (item.name.contains(CONJURADO)) {
            return new Conjurado(item);
        }
        else {
            return new Normal(item);
        }
    }
}
