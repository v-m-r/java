import java.util.*;
class Address{
    private String name;
    private String address;
    private String state;
    private String num;
    Address(String n,String a,String s,String N){
        name = n;
        address = a;
        state = s;
        num = N;
    }
    @Override
    public String toString() {
        return String.join(", ",name,address,state,num);
    }

}
public class UserDefColec {
    public static void main(String[] args) {
        Address ad = new Address("name1","add1","State1","Num1");
        LinkedList<Address> ADL = new LinkedList<>();
        ADL.add(ad);
        ADL.add(new Address("name2","add2","State2","Num2"));
        ADL.add(new Address("name3","add3","State3","Num3"));
        ADL.add(new Address("name4","add4","State4","Num4"));
        for(Address a: ADL){
            System.out.println(a);
        }
    }

}
