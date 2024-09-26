package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;

public class EagerVsLazy {

    public static void main(String[] args) {

        Session savesession = SessionFactoryConfig.getInstance().getSession();

        Customer customer=new Customer();
        customer.setName("Kamal");
        customer.setAddress("Galle");

        savesession.save(customer);
        savesession.close();

        //1.Get Method

        Session getsession = SessionFactoryConfig.getInstance().getSession();
        System.out.println("======Calling Get Method======");

        Customer get = getsession.get(Customer.class,1);
        System.out.println("Customer Id of get:"+get.getId());
        System.out.println("Customer Name of get:"+get.getName());
        getsession.close();

        //2.Load Method

        Session loadsession = SessionFactoryConfig.getInstance().getSession();
        System.out.println("======Calling Load Method======");

        Customer load = loadsession.load(Customer.class,1);
        System.out.println("Customer Id of load:"+load.getId());
        System.out.println("Customer Name of load:"+load.getName());
        loadsession.close();

    }
}
