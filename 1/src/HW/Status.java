package HW;

import java.util.Scanner;

public class Status {
    int completed;
    Scanner in = new Scanner(System.in);
    public void complition(){
        System.out.println("Student has met the major requirements? y/n");
        String input = in.next();
        switch(input){
            case "y":
                System.out.println("Completed");
                break;
            case "n":
                System.out.println("Not completed");
                break;
            default:
                    System.out.println("invalid input");
        }
    }
}
