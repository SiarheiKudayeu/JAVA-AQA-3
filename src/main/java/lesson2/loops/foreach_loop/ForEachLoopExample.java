package lesson2.loops.foreach_loop;

import java.util.Arrays;
import java.util.Random;

public class ForEachLoopExample {
    public static void main(String[] args) {
        String[] arrayText = {"One", "Two", "Three", "Four"};
        System.out.println("======================FOR===============");
        for(int i = 0; i < arrayText.length; i++){
            System.out.println(arrayText[i]);
        }
        System.out.println("======================FOR EACH===============");

        for(String text: arrayText){
            System.out.println(text);
        }

        System.out.println("==============INIT===============");
        int[] arrayLoop = new int[10];
        System.out.println(Arrays.toString(arrayLoop));
        Random random =  new Random();
        for (int number: arrayLoop){
           number = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(arrayLoop));
    }
}
