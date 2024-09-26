package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import lk.ijse.gdse.orm.hibernate.entity.Order;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SQLQueryEvaluator {
    public static void main(String[] args) {
        System.out.println("=====JPQL Get All====");
        Session session = SessionFactoryConfig.getInstance().getSession();
        String sql = "SELECT C FROM Customer AS C";  //api dena jpql query eka thmai me..
        Query query = session.createQuery(sql);
        List<Customer> list = query.list();
        for (Customer customer:list) {
            System.out.println(customer);
        }
        session.close();

        System.out.println("=====JPQL Where Clause====");
        Session jpqlWhereSession = SessionFactoryConfig.getInstance().getSession();
        String jpql = "SELECT C FROM Customer AS C WHERE C.id= :cus_id";//(cus_id) ewt name query parameters kyl kyno
        Query namedQuery = jpqlWhereSession.createQuery(jpql);
        namedQuery.setParameter("cus_id",2);
        Customer customer =(Customer) namedQuery.getSingleResult();
        System.out.println(customer);
        jpqlWhereSession.close();

        System.out.println("=====JPQL Join Clause====");
        Session jpqlJoinSession = SessionFactoryConfig.getInstance().getSession();
        String sql1 = "SELECT O FROM Order AS O\n"+
                "INNER JOIN Customer AS C\n"+
                "ON O.customer.id=C.id\n"+
                "WHERE C.id = :cus_id";

        Query jpqlJoinSessionQuery = jpqlJoinSession.createQuery(sql1);
        jpqlJoinSessionQuery.setParameter("cus_id",2);
        List<Order> list1 = jpqlJoinSessionQuery.list();
        for (Order order : list1) {
            System.out.println(order);
        }
        jpqlJoinSession.close();

        System.out.println("=====HQL Get All====");

        Session hqlGetAllSession = SessionFactoryConfig.getInstance().getSession();
        String sql2 = "FROM Customer";
        Query hqlGetAllQuery = hqlGetAllSession.createQuery(sql2);
        List<Customer> list2 =hqlGetAllQuery.list();
        for (Customer customer1:list2) {
            System.out.println(customer1);  
        }
        hqlGetAllSession.close();;

    }
}
