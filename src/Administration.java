
public class Administration extends Employee {
    private int vacation;

    public Administration(String name, String cpr){
        super(name, cpr, 37, 23000);
        vacation = 5;
    }

    public int getVacation(){
        return vacation;
    }

    public void setVacation(int vacation){
        this.vacation = vacation;
    }
    @Override
    public String toString(){
        return getName()+"\t"+getCpr()+"\t"+getHours()+"\t"+getSalary()+"\t"+getVacation();
    }

}
