package include_smpl;

import figure.Circle;
import figure.Figure;
import figure.Rectangle;
import figure.Triangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=null;

        try{

            Figure[] figures = new Figure[9];
            scanner=new Scanner(new File("src/in.txt"));

            for(int i=0;i<9;i++) {

                int sw = scanner.nextInt();
                switch (sw) {
                    case 1:
                        figures[i]=new Rectangle(scanner.nextInt(),scanner.nextInt(),
                                scanner.nextInt(),scanner.nextInt());
                        break;
                    case 2:
                        figures[i]=new Circle(scanner.nextInt(),scanner.nextInt(),
                                scanner.nextInt());
                        break;
                    case 3:
                        figures[i]=new Triangle(scanner.nextInt(),scanner.nextInt(),
                                scanner.nextInt(),scanner.nextInt());
                        break;
                        default:
                            System.out.println("Ошибка определения типа фигуры");
                            break;
                }
            }

            for (Figure figure:figures) {
                System.out.print(figure.toString()+" ");
                System.out.println(figure.getSquare());
            }

            double allSquare=0;
            for (Figure figure:figures) {
                allSquare=allSquare+figure.getSquare();
            }

            System.out.println("Общая площадь равна "+allSquare);

            double min=figures[0].getSquare();
            double max=figures[0].getSquare();

            for(int i=0;i<9;i++){
                if(figures[i].getSquare()<=min){
                    min=figures[i].getSquare();
                }
                if(figures[i].getSquare()>=max){
                    max=figures[i].getSquare();
                }
            }

            System.out.println("Максимальная площадь "+max+"\n"+
            "Минимальная площадь "+min);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}