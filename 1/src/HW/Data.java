package HW;

import java.util.Scanner;

public class Data extends Status implements Student {

    Scanner in = new Scanner (System.in);
       public void studentName() {
           System.out.println("Enter the name of the student: ");
           String sName = in.next();
       }
       public String n;
        public String getName(){
            return n;
        }
        public void setName(String n){
            this.n = n;
        }
    public void studentAddress() {
        System.out.println("Enter the address of the student: ");
        String sAdd = in.next();
    }
    public String a;
    public String getAddress(){
        return a;
    }
    public void setAddress(String a){
        this.a = a;
    }


}
