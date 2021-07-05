package Concepts;

public class Employees {
    private int age;
    private String firstName;
    private String lastName ="meziane";
    private int emplId ;
    private EmplyeeRoles role;

    public EmplyeeRoles getRole() {
        return role;
    }

    public void setRole(EmplyeeRoles role) {
        this.role = role;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmplId() {
        return emplId;
    }

    public void setEmplId(int emplId) {
        this.emplId = emplId;
    }


     Employees() {

    }

    public Employees(int age, String lastName, String firstName, int emplId, EmplyeeRoles role) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emplId = emplId;
       this.role= role;
    }

}
