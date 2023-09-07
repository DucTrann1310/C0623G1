package Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product{
    private long id;
    private String name;
    private String description;
    private double price;
    private ECategory category;
    private int quantity;

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', description='%s', price=%.2f, category=%s, quantity=%d}",
                id, name, description, price, category, quantity);
    }
}
