package cart.domain.order;

import cart.domain.Product;

public class OrderItem {

    private final Long id;
    private final Product product;
    private final int quantity;

    public OrderItem(Product product, int quantity) {
        this(null, product, quantity);
    }

    public OrderItem(Long id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public Long getProductId() {
        return product.getId();
    }

    public String getName() {
        return product.getName();
    }

    public int getProductPrice() {
        return product.getPrice();
    }

    public String getImageUrl() {
        return product.getImageUrl();
    }

    public int getQuantity() {
        return quantity;
    }
}
