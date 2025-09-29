package springbot.dna_orders_check.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import springbot.dna_orders_check.model.ProductOrder;

import java.util.List;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

    @Query(value="SELECT * FROM product_order WHERE date::date = CURRENT_DATE and shop = :shop", nativeQuery=true)
    List<ProductOrder> findTodayOrdersOfShop(@Param("shop") String shopName);
}
