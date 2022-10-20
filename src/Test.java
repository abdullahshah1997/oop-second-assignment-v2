import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[]args) throws IOException {
        Scanner scan = new Scanner("customers.txt");
        DataList data = new DataList();
        List<String> dataList = data.get("src/customers.txt");
        Iterator<String> it = dataList.iterator();
    }
}
