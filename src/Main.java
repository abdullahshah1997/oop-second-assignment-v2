import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader instream = new BufferedReader((new FileReader("src/customers.txt")));
        List<String> dataList = new ArrayList<>();
        while(true){
            String currentLine = instream.readLine();
            if(currentLine!=null) {
                dataList.add(currentLine);
            }//if
            else {
                break;
            }//else
        }//while
        dataList.remove(28);

        MemberMaker memberMaker = new MemberMaker();
        memberMaker.memberList(dataList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in namn eller personnummer för att veta status för medlemskap.");
        String input = scan.nextLine();
    }
}
