import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException {
        try(BufferedReader instream = new BufferedReader((new FileReader("src/customers.txt")));
        PrintWriter outstream = new PrintWriter(new FileWriter("src/CustomerData.txt",true));) {

            List<String> dataList = new ArrayList<>();
            while (true) {
                String currentLine = instream.readLine();
                if (currentLine != null) {
                    dataList.add(currentLine);
                }//if
                else {
                    break;
                }//else
            }//while
            dataList.remove(28);

            MemberMaker memberMaker = new MemberMaker();
            List<Member> allMembers = memberMaker.memberList(dataList);
            LocalDate today = LocalDate.now();
            Scanner scan = new Scanner(System.in);

            while(true){
            System.out.println("Skriv in namn eller personnummer för att veta status för medlemskap. Mata in x för att" +
                    " avsluta programmet.");
            String input = scan.nextLine();
            String message = "";

            for (int i = 0; i < allMembers.size(); i++) {
                if (allMembers.get(i).name.equalsIgnoreCase(input) || allMembers.get(i).idNumber.equals(input)) {
                    if (allMembers.get(i).isMembershipActive()) {
                        message = "Personen är en nuvarande medlem.";
                        outstream.println(allMembers.get(i).idNumber+", "+allMembers.get(i).name+"\n"+today);
                        break;
                    }
                    else {
                        message = "Personen är en före detta medlem.";
                        break;
                    }
                }
                else
                    if(!input.equals("x"))
                    message = "Personen har aldrig varit medlem.";
            }
            System.out.println(message);

            if(input.equals("x"))
                break;
        }
        }
    }
}
