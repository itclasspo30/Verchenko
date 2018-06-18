package rabbit_smpl;

import rabbit.Rabbit;

import static rabbit.Rabbit.getAverageWeight;

public class Main {

    public static void main(String[] args) {

        Rabbit rabbitOriginal=new Rabbit("Роджер",13.5,"Голубой","Белая");

        Rabbit rabbitClone=new Rabbit(rabbitOriginal);

       System.out.println("Оригинальный кролик: "+rabbitOriginal.toString());
       System.out.println("Клонированный кролик: "+rabbitClone.toString());

       System.out.println("Средний вес 2х кроликов: "+getAverageWeight(rabbitOriginal,rabbitClone));

    }
}
