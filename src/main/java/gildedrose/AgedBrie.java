package gildedrose;


import static gildedrose.GildedRose.MAX_QUALITY;

public class AgedBrie extends ItemGlideRose{

    public AgedBrie(Item item ) {super(item);}

    @Override
    public void updateQuality()
    {
        if (this.getItem().quality < MAX_QUALITY) {
            this.getItem().quality = this.getItem().quality + 1;
        }
        this.getItem().sellIn = this.getItem().sellIn - 1;

        if (this.getItem().sellIn < 0) {
            if (this.getItem().quality < MAX_QUALITY) {
                this.getItem().quality = this.getItem().quality + 1;
            }
        }
    }
}
