package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Comté" :
                    updateComte(item);
                    break;
                case "Kryptonite" :
                    updateKryptonite(item);
                    break;
                case "Pass VIP Concert" :
                    updatePassVIP(item);
                    break;
                case "Magic product" :
                    updateMagic(item);
                    break;
                default :
                    updateLamda(item);
                    break;
            }
        }
    }

    private void updateMagic(Item item) {
        if (item.sellIn > 0) {
            item.quality -= 2;
        } else if (item.sellIn <= 0) {
            item.quality -= 4;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
        item.sellIn -= 1;
    }

    private void updateComte(Item item) {
        item.quality = item.quality + 1;
        if (item.sellIn <= 0) {
            item.quality += 1;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
        item.sellIn -= 1;
    }

    private void updateLamda(Item item) {

        if (item.sellIn > 0) {
            item.quality -= 1;
        } else if (item.sellIn <= 0) {
            item.quality -= 2;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
        item.sellIn -= 1;
    }

    private void updatePassVIP(Item item) {
        item.quality += 1;
        if (item.sellIn < 11) {
            item.quality += 1;
        }
        if (item.sellIn < 6) {
            item.quality += 1;
        }

        if (item.quality > 50) {
            item.quality = 50;
        }
        item.sellIn -= 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void updateKryptonite(Item item) {
        //nothing to do
    }

//    public void updateQuality() {
//        for (int i = 0; i < items.length; i++) {
//            if (!items[i].name.equals("Comté")
//                    && !items[i].name.equals("Pass VIP Concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Kryptonite")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Pass VIP Concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Kryptonite")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Comté")) {
//                    if (!items[i].name.equals("Pass VIP Concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Kryptonite")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
//    }
}
