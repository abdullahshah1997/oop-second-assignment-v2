import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberMaker {
    public List<Member> memberList(List<String> dataList){
        List <Member> allMembers = new ArrayList<Member>();
        Iterator <String> it = dataList.iterator();

        while(it.hasNext()){
            String firstRow = it.next();
            String idNumber = firstRow.split(", ")[0];
            String name = firstRow.split(", ")[1];
            String secondRow = it.next();
            LocalDate paymentDate = LocalDate.parse(secondRow);
            Member member = new Member(idNumber, name, paymentDate);
            allMembers.add(member);
        }

        return allMembers;
    }
}
