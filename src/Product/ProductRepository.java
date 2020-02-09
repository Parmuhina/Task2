package Product;

import Domain.ProductVariables;
import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    private Long productIdSequence = 0L;
    private Map<Long, ProductVariables> tasks = new HashMap<>();

    public ProductVariables insert(ProductVariables productVariables) {
        productVariables.setId(productIdSequence++);
        tasks.put(productVariables.getId(), productVariables);
        return productVariables;
    }

    public ProductVariables findProductById(Long id) {
        return tasks.get(id);
    }
}
