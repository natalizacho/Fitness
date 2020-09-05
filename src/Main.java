import java.util.*;

public class Main {
    public static void main(String [] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Administration("Claus", "221175-1011");
        Employee emp2 = new Instructor("Tove", "011080-1014", 20);
        Employee emp3 = new Administration("Anna", "011080-1012");
        Employee emp4 = new Instructor("Henning", "011080-1014", 15);
        employeeList.addAll(Arrays.asList(emp1,emp2,emp3,emp4));

        ArrayList<Member> memberList = new ArrayList<>();
        Member mem1 = new Member("Morten", "130195-1301", false);
        Member mem2 = new Member("Martin", "221175-1011", true);
        Member mem3 = new Member("Martina", "050970-1409", false);
        Member mem4 = new Member("Marcel", "221175-1011", true);
        memberList.addAll(Arrays.asList(mem1,mem2,mem3,mem4));

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.addAll(Arrays.asList(emp1,emp2,emp3,emp4, mem1,mem2,mem3,mem4));

        System.out.println("Employees" +"\n"+  "Name" + "\t" + "CPR" + "\t" + "Hours" + "\t" + "Salary" + "\t" + "Vacation");
        for(int i=0;i<employeeList.size();i++){
            System.out.println(employeeList.get(i).toString());
        }

        System.out.println();
        System.out.println("Members" + "\n"+  "Name" + "\t" + "CPR" + "\t" + "Membership" + "\t" + "Fee");
        for(int i=0;i<memberList.size();i++) {
            System.out.println(memberList.get(i));
        }
        System.out.println();
        System.out.println("Employee and Members"+"\n"+ "Name " + "\t" + "CPR");
        for(int i=0;i<personArrayList.size();i++){
            System.out.println(personArrayList.get(i).getName()+"\t"+personArrayList.get(i).getCpr());
        }
    }
}


