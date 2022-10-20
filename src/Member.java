import java.time.LocalDate;

public class Member {
    public final String idNumber;
    public final String name;
    public final LocalDate dateLastPaid;


    public Member(String idNumber, String name, LocalDate dateLastPaid){
        this.idNumber = idNumber;
        this.name = name;
        this.dateLastPaid = dateLastPaid;
    }

    public boolean isMembershipActive(){

        return dateLastPaid.isAfter(LocalDate.now().minusYears(1));

    }
}
