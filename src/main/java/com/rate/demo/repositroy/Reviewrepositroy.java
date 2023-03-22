package com.rate.demo.repositroy;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rate.demo.model.ReviewEntity;
public interface Reviewrepositroy extends JpaRepository<ReviewEntity, Integer>  {
	
	public List<ReviewEntity> getByProductId(int  productId);
	
	
}
