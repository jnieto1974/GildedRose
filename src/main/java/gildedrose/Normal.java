package gildedrose;

public class Normal extends ItemGlideRose{

        public Normal(Item item)  { super(item);}

        @Override
        public void updateQuality()
        {
            if (this.getItem().quality > 0) {
                this.getItem().quality = this.getItem().quality - 1;
            }
            this.getItem().sellIn = this.getItem().sellIn - 1;

            if (this.getItem().sellIn < 0) {
                if (this.getItem().quality > 0) {
                    this.getItem().quality = this.getItem().quality - 1;
                }
            }
        }
}
