package dsi.poc.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dsi.poc.order.entity.OrderEntity;

@Repository
public interface OrderJpaRepository extends JpaRepository<OrderEntity,Long>{

}
