
public class Member extends Person{
    public boolean isBasic;

    public Member(String name, String cpr, boolean isBasic){
        super(name, cpr);
        this.isBasic=isBasic;
    }

    public String memberType(){
        String type;
        if (isBasic){
            type = "Basic";
        }
        else{
            type = "Full";
        }
        return type;
    }

    public int monthlyFee(){
        int fee;
        if (isBasic){
            fee = 199;
        }
        else{
            fee= 299;
        }
        return fee;
    }
    @Override
    public String toString(){
        return getName()+"\t"+getCpr()+"\t"+memberType()+"\t"+monthlyFee();
    }


}
