package lk.ijse.gdse.orm.hibernate.entity;
/*
import lk.ijse.gdse.orm.hibernate.embedded.MobileNo;
import lk.ijse.gdse.orm.hibernate.embedded.NameIdentifier;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// 1st Way -> @Entity(name = "customer")
// 2nd Way -> @Entity
//            @Table(name = "customer")
@Entity
@Table(name = "customer")

public class Customer {
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nameIdentifier=" + nameIdentifier +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", createdDateTime=" + createdDateTime +
                ", dob='" + dob + '\'' +
                '}';
    }

    //column
    //primary key nisa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    public Customer(){}

    public Customer(NameIdentifier nameIdentifier, int id, String address, double salary, int age, Timestamp createdDateTime, String dob) {
        this.nameIdentifier = nameIdentifier;
        this.id = id;
        this.address = address;
        this.salary = salary;
        this.age = age;
        this.createdDateTime = createdDateTime;
        this.dob = dob;
    }
//    @Column(name = "customer_name", nullable = false, length = 50)
//    private String name;

    private NameIdentifier nameIdentifier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "customer_address")
    private String address;

    public NameIdentifier getNameIdentifier() {
        return nameIdentifier;
    }

    public void setNameIdentifier(NameIdentifier nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
    }

    @Column(name = "customer_salary")
    private double salary;

    @Column(name = "customer_age", columnDefinition = "TINYINT")
    private int age;

    public int getAge() {
        return age;
    }
//    private UpdateTimestamp createdDateTime;

    @CreationTimestamp
    private Timestamp createdDateTime;

    @Transient
    @Column(name ="customer_dob")
    private String dob;

    //custa mobile number gdk thyeno kyl thmai me list eken kynne
    //new arraylist ekk gtte null points enn pluwn nisa

    @ElementCollection
    //db eke me entity eke me table eke nma mkkd kyl thmai methna add krnne
    @CollectionTable(name = "customer_mobile_nos",
                    joinColumns = @JoinColumn(name = "customer_id"))
    private List<MobileNo> phoneNos = new ArrayList<>();

    public List<MobileNo> getPhoneNos() {
        return phoneNos;
    }

    public void setPhoneNos(List<MobileNo> phoneNos) {
        this.phoneNos = phoneNos;
    }
}
*/
