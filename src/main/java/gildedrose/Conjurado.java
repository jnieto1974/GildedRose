package gildedrose;

public class Conjurado extends ItemGlideRose{

        public Conjurado(Item item ) {super(item);}

        @Override
        public void updateQuality() {
            if (this.getItem().quality > 0) {
                if (this.getItem().quality > 1) {
                    this.getItem().quality = this.getItem().quality - 2;
                } else {
                    this.getItem().quality = this.getItem().quality - 1;
                }
                this.getItem().sellIn = this.getItem().sellIn - 1;

                if (this.getItem().sellIn < 0) {
                    if (this.getItem().quality > 0) {
                        if (this.getItem().quality > 1) {
                            this.getItem().quality = this.getItem().quality - 2;
                        } else {
                            this.getItem().quality = this.getItem().quality - 1;
                        }
                    }
                }
            }
        }
}
