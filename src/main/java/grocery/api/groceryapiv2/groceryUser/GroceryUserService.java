package grocery.api.groceryapiv2.groceryUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryUserService {
    private final GroceryUserRepository groceryUserRepository;

    @Autowired
    public GroceryUserService(GroceryUserRepository groceryUserRepository) {
        this.groceryUserRepository = groceryUserRepository;
    }

    public List<GroceryUser> getUsers() {
        return groceryUserRepository.findAll();
//        return List.of(
//                new GroceryUser(
//                        "BigOlDave",
//                        "David",
//                        "Phan",
//                        "example@gmail.com"
//                ),
//                new GroceryUser(
//                        "Spoofaloof",
//                        "Chris",
//                        "Phan",
//                        "example2@gmail.com"
//                )
//        );
    }
}
