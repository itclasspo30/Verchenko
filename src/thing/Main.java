package thing;

import thing_package.Thing;

public class Main {

    public static void main(String[] args) {
        Thing[] things=new Thing[5];
        things[0]=new Thing(Thing.TypeMaterial.COTTON,Thing.TypeSize.XL,
                "green","Zara",150);
        things[1]=new Thing(Thing.TypeMaterial.WOOL,Thing.TypeSize.XXL,"red","D&G",300);
        things[2]=new Thing(Thing.TypeMaterial.SYNTHETICS,Thing.TypeSize.XS,"red","Gucci",500);
        things[3]=new Thing(Thing.TypeMaterial.COTTON,Thing.TypeSize.L,"yellow","Versace",500);
        things[4]=new Thing(Thing.TypeMaterial.ELASTAN,Thing.TypeSize.XXL,"black","Prada",750);

        System.out.println("Вещи размера XXL");
        for (int i=0;i<5;i++){
            if(things[i].getSize()==Thing.TypeSize.XXL){
                System.out.println(things[i]);
            }
        }

        System.out.println("Вещи из хлопка");
        for(int i=0;i<5;i++){
            if(things[i].getMaterial()==Thing.TypeMaterial.COTTON){
                System.out.println(things[i]);
            }
        }

        System.out.println("Все вещи и стоимость с учетом акции 'На красное'");
        for (Thing thing:things) {
            if(thing.getColor().compareTo("red")==0){
                thing.costRed();
            }
            System.out.println(thing);
        }

    }
}
