package entities;

public class Order extends Grade {

    private String order;

    public Order(String kingdom, String phylum, String grade, String order) {
        super(kingdom, phylum, grade);
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String showDescription() {
        return super.showDescription() + "Ordem " + order + "\n";
    }
}
