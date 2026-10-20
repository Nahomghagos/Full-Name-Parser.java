package s;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner (System.in);
        System.out.println("what is your first name?");
        String firstName =myScanner.nextLine().trim();
        System.out.println("what is your middle name?");
        String middleName = myScanner.nextLine().trim();
        System.out.println("what is your last name?");
        String lastNAme= myScanner.nextLine().trim();
        System.out.println( "Fullname: " + nameList(firstName,middleName,lastNAme));
        myScanner.close();


    }public static String nameList (String name, String mname, String lname) {
    String fname = name + " ";
    if (!mname.isEmpty()) {
        fname += mname.substring(0,1) + ".";

    }else {
        fname += "(none)";
    }
    fname += " " +lname;

      return fname;
    }

}
