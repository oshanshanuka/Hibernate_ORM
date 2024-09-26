package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class DetachedState {
    public static void main(String[] args) {
        Session session = SessionFactoryConfig
                .getInstance()
                .getSession();

        //Persistent

        Customer customer = new Customer(
                1,
                "Saman",
                "Galle",
                new ArrayList<>());

        int cusId = (int)  session.save(customer);

        System.out.println("Customer Id:"+cusId);

        System.out.println(isExistsInSession(session, customer));

        session.close();

        Session detatchedSession = SessionFactoryConfig
                .getInstance()
                .getSession();
        Transaction transaction = detatchedSession.beginTransaction();
        detatchedSession.detach(customer); // Detached state ekt yna ek wenne

        System.out.println(isExistsInSession(detatchedSession, customer));

        customer.setAddress("Matara");
        detatchedSession.save(customer);//save method ek wenuwta merge dunnoth same record update query ekk wadinw
        //save dunnoth aluth ekk hdenwa

        System.out.println(isExistsInSession(detatchedSession, customer));
        transaction.commit();
        detatchedSession.close();



    }
    private static String isExistsInSession(Session session, Customer customer) {
        return session.contains(customer) ?
                "This object is in persistent"
                :"This object is in detatched";
    }
}