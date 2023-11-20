package diploma.project.keycloakauth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final List<Product> products = List.of(
            new Product(1L, "Pen", 10L, "Kazakhstan", 2020),
            new Product(2L, "Pencil", 15L, "Russia", 2020),
            new Product(3L, "Bottle", 7L, "Uzbekistan", 2020),
            new Product(4L, "Phone", 9L, "USA", 2020),
            new Product(5L, "Charge", 3L, "China", 2020)
    );

    public List<Product> getAll() {
        return products;
    }
}
