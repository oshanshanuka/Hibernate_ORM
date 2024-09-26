package lk.ijse.gdse.orm.hibernate.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NameIdentifier {

    @Column(name="first_name")
    private String firstname;
    @Column(name="middle_name")
    private String middlename;
    @Column(name="last_name")
    private String lastname;

    public NameIdentifier(){}

    public NameIdentifier(String firstname, String middlename, String lastname) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename(String de) {
        return middlename;
    }

    @Override
    public String toString() {
        return "NameIdentifier{" +
                "firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



}
