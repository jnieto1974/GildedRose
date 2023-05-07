package gildedrose;

public class Normal extends ItemGlideRose{

        public Normal(Item item)  { super(item);}

        @Override
        public void updateQuality()
        {
            updateQualityItem();
            updateSellinItem();
        }

    @Override
    public void updateQualityItem() {
        if (this.getItem().quality > 0) {
            this.getItem().quality = this.getItem().quality - 1;
        }
    }

    @Override
    public void updateSellinItem() {

        this.getItem().sellIn = this.getItem().sellIn - 1;

        if (this.getItem().sellIn < 0) {
            updateQualityItem();
        }
    }
}
