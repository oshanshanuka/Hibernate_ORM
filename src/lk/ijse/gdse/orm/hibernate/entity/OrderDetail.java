package lk.ijse.gdse.orm.hibernate.entity;

import lk.ijse.gdse.orm.hibernate.embedded.OrderDetailPK;

import javax.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {



    @Column(name = "order_quantity")
    private int orderQty;

    @Column(name = "order_price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id",insertable = false,updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_id",insertable = false,updatable = false)
    private Item item;

    @EmbeddedId
    private OrderDetailPK orderDetai1PK;

}
