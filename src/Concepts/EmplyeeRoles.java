package Concepts;

public class EmplyeeRoles extends Employees {
static String nickName="Bill";
//    public EmplyeeRoles(int age, String lastName, String firstName, int emplId) {
//        super(age, lastName, firstName, emplId);
//    }
    public void jhon(){
        String job ="it";
        //System.out.println(job);
        job="computer science";
        System.out.println(job);
        EmplyeeRoles.super.setFirstName("smith");
        //EmplyeeRoles.super.setLastName("amar");
        System.out.println( EmplyeeRoles.super.getFirstName());
        System.out.println( EmplyeeRoles.super.getLastName());
    }
public static void main(String[] args) {
System.out.println(nickName);
    EmplyeeRoles ob = new EmplyeeRoles();
    ob.jhon();
   // System.out.println(ob.jhon(jhonAge));
}
}
