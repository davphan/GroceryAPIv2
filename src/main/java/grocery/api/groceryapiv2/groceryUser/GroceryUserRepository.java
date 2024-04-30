package grocery.api.groceryapiv2.groceryUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryUserRepository extends JpaRepository<GroceryUser, Long> {

}
