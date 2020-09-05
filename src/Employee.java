
public class Employee extends Person {
    private int hours;
    private int salary;

    public Employee(String name, String cpr){
        super(name, cpr);
    }
    public Employee(String name, String cpr,int hours, int salary){
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }


    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public Employee (String name, String cpr, int hours){
        super(name, cpr);
        this.hours = hours;
    }
    @Override
    public String toString(){
        return getName()+"\t"+getCpr()+"\t"+getHours()+"\t"+getSalary();
    }
}
