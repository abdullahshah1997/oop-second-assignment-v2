import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[]args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in namn eller personnummer för att veta status för medlemskap.");
        String input = scan.nextLine();
        CustomerChecker customerChecker = new CustomerChecker();
        DataList dataList = new DataList();
        ArrayList<String> myList = dataList.get("src/customers.txt");
        String[] myArray = myList.get(2).split(", ");

        System.out.println(myArray[1]);

        customerChecker.customerInfo("src/customers.txt",input);
    }
}
