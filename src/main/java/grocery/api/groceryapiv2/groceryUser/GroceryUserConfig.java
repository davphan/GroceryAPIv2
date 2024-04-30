package grocery.api.groceryapiv2.groceryUser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GroceryUserConfig {

    @Bean
    CommandLineRunner commandLineRunner(GroceryUserRepository repository) {
        // Default database entries on startup
        return args -> {
            GroceryUser a = new GroceryUser(
                    "BigOlDave",
                    "David",
                    "Phan",
                    "example@gmail.com"
            );
            GroceryUser b = new GroceryUser(
                    "Spoofaloof",
                    "Chris",
                    "Phan",
                    "example2@gmail.com"
            );
            repository.saveAll(
                    List.of(a, b)
            );
        };
    }
}
