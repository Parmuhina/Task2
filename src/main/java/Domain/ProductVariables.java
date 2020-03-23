package Domain;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductVariables {
    private Long id;
    private String name;
    private BigDecimal price;
    private String category;
    private BigDecimal percent;
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public String setCategory(String category){
        return this.category=category;
    }

    public BigDecimal getPercent(){
        return percent;
    }

    public BigDecimal setPercent (BigDecimal percent){
        return this.percent=percent;
    }

    public String getText(){
        return text;
    }

    public String setText (String text){
        return this.text=text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductVariables product = (ProductVariables) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price); //&&
               // Objects.equals(percent, product.percent);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, price, percent);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", percent='" + percent + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

}
