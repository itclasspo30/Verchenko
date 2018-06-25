package shop;

import shop_package.Shop;

public class Main {

    public static void main(String[] args) {
        Shop[] shops=new Shop[5];
        shops[0]=new Shop("Чечерская,56", Shop.Type.ELECTRONICS_STORE,"Электросила");
        shops[1]=new Shop("Кирова, 12", Shop.Type.BOOK_STORE,"Книголюб");
        shops[2]=new Shop("Ленина, 76", Shop.Type.GROCERY_STORE,"Сладенький");
        shops[3]=new Shop("Советская,123", Shop.Type.ELECTRONICS_STORE,"Пятый элемент");
        shops[4]=new Shop("Хатаевича, 4", Shop.Type.GROCERY_STORE,"Линия");

        if(shops[0].equals(shops[4])){
            System.out.println("Объекты одинаковы");
        }
        else {
            System.out.println("Объекты разные");
        }

        for (Shop shop:shops) {
            System.out.println(shop.toString());
        }
    }
}
