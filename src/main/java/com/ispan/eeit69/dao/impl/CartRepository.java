//package com.ispan.eeit69.dao.impl;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.ispan.eeit69.model.Cart;
//
//public interface CartRepository extends JpaRepository<Cart, Long> {
//	@Query("SELECT u.username AS user_name, i.item_name AS item_name " +
//		       "FROM Cart c " +
//		       "INNER JOIN User u ON c.userId = u.userId " +
//		       "INNER JOIN Item i ON c.itemId = i.itemId " +
//		       "WHERE c.userId = 8")
//		List<Object[]> findCartInfoByUserId();
//
//}
