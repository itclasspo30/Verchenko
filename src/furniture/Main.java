package furniture;

import furniture_smpl.Furniture;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import furniture_smpl.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=null;

        try {
            Furniture[] furniture=new Furniture[9];
            scanner=new Scanner(new File("src/in.txt"));

            for(int i=0;i<9;i++) {

                int sw = scanner.nextInt();
                switch (sw) {
                    case 1:
                        furniture[i]=new ChairFurniture(scanner.nextLine());
                        break;
                    case 2:
                        furniture[i]=new TableFurniture(scanner.nextLine());
                        break;
                    case 3:
                        furniture[i]=new LockerFurniture(scanner.nextLine());
                        break;
                    default:
                        System.out.println("Ошибка определения типа мебели");
                        break;
                }
            }

            for (Furniture furnitures:furniture) {
                System.out.println(furnitures.toString()+" "+
                        furnitures.getCostWithDiscount()+" "+furnitures.getColor());
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
