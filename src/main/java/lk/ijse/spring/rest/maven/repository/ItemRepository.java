package lk.ijse.spring.rest.maven.repository;

import lk.ijse.spring.rest.maven.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemRepository extends JpaRepository<Item, Integer> {

//    @Query("SELECT count(i.itemCode) FROM Item i")
//    long getTotalItems();
}
