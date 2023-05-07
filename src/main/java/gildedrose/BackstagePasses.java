package gildedrose;

public class BackstagePasses extends ItemGlideRose{

        public BackstagePasses(Item item ) {super(item);}

        @Override
        public void updateQuality()
        {
            updateQualityItem();
            updateSellinItem();
        }

        @Override
        public void updateSellinItem() {

            this.getItem().sellIn = this.getItem().sellIn - 1;

            if (this.getItem().sellIn < 0) {
                this.getItem().quality = this.getItem().quality - this.getItem().quality;
            }
        }

        @Override
        public void updateQualityItem() {

            if (this.getItem().quality < GildedRose.MAX_QUALITY) {
                this.getItem().quality = this.getItem().quality + 1;

                if (this.getItem().sellIn < 11) {
                    if (this.getItem().quality < GildedRose.MAX_QUALITY) {
                        this.getItem().quality = this.getItem().quality + 1;
                    }
                }

                if (this.getItem().sellIn < 6) {
                    if (this.getItem().quality < GildedRose.MAX_QUALITY) {
                        this.getItem().quality = this.getItem().quality + 1;
                    }
                }
            }
        }
}
