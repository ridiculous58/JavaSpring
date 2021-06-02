package kodlamaio.northwind.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter setter oluşturur
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
    private int id;
    private String productName;
    private String categoryName;

}
