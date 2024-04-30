package grocery.api.groceryapiv2.groceryUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v2/user")
public class GroceryUserController {

    private final GroceryUserService userService;

    @Autowired
    public GroceryUserController(GroceryUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<GroceryUser> getAllUsers() {
        return userService.getUsers();
    }
}
