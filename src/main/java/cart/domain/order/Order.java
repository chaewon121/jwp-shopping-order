package cart.domain.order;


import cart.domain.Member;

import java.util.List;

public class Order {

    private final Long id;
    private final Member member;
    private final Long shippingFee;
    private final Long totalPrice;
    private final List<OrderItem> orderItems;
    private final String createdAt;

    public Order(Member member, Long shippingFee, Long totalPrice, List<OrderItem> orderItems, String createdAt) {
        this(null, member, shippingFee, totalPrice, orderItems, createdAt);
    }

    public Order(Long id, Member member, Long shippingFee, Long totalPrice, List<OrderItem> orderItems, String createdAt) {
        this.id = id;
        this.member = member;
        this.shippingFee = shippingFee;
        this.totalPrice = totalPrice;
        this.orderItems = orderItems;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

    public Long getShippingFee() {
        return shippingFee;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}