package HW;

import java.util.Scanner;

public class TestApp {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Student s1 = new Data();
        s1.studentName();
        ((Data) s1).complition();


        ((Data) s1).setName("adeeb");
        System.out.print(((Data) s1).getName());
        ((Data) s1).setAddress("NY ");
        System.out.println(((Data) s1).getAddress());

    }
}
