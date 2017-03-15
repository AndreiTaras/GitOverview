package net.gitoverview;

/**
 * Created by Andrei on 15.03.2017.
 */
public class Person extends  BaseEntity {

    private  String firtname;

    private String lastname;

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firtname='" + firtname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
