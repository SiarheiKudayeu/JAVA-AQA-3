package lesson2.loops.while_do;

import java.util.Scanner;

public class TaskExample {
        /*
    For example, you have a social network where you can upload photos.
    The user is asked from the console how many photos
    he would like to upload to his album,
    but there is a limit on the size of the album of 100 photos
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPhoto = 0;
        while (countOfPhoto <= 100){

            if(countOfPhoto == 100){
                break;
            }

            System.out.println("How many photos do you want to add?");
            int tempPhotos = scanner.nextInt();

            if((countOfPhoto + tempPhotos) > 100){
                System.out.println("Limit was reached");
                System.out.println("You have left space for " + (100 - countOfPhoto));
                continue;
            }

            countOfPhoto = countOfPhoto + tempPhotos;
            System.out.println("You have left space for " + (100 - countOfPhoto));
        }
    }
}
