import java.time.LocalDate;

public class Member {
    String idNumber;
    String name;
    LocalDate dateLastPaid;


    public Member(){

    }
    public Member(String idNumber, String name, LocalDate dateLastPaid){
        this.idNumber = idNumber;
        this.name = name;
        this.dateLastPaid = dateLastPaid;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateLastPaid() {
        return dateLastPaid;
    }

    public void setDateLastPaid(LocalDate dateLastPaid) {
        this.dateLastPaid = dateLastPaid;
    }

    public boolean isMembershipActive(){

        return dateLastPaid.isAfter(LocalDate.now().minusYears(1));

    }
}
