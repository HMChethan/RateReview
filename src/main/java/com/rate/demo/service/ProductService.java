   package com.rate.demo.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rate.demo.model.ProductEntity;
import com.rate.demo.model.ReviewEntity;
import com.rate.demo.repositroy.Productrepositroy;


@Service
public class ProductService {
     @Autowired
	private Productrepositroy testrepositroy2;
	public ProductEntity addProduct(ReviewEntity r) {
		Optional<ProductEntity> pro=testrepositroy2.findById(r.getProductId()); 
		if(pro.isPresent())
		{
			ProductEntity pro1=testrepositroy2.getById(r.getProductId());
			  double d1=((pro1.getProductRatings()*pro1.getNumberofreviews())+r.getProductRating())/(pro1.getNumberofreviews()+1);
            pro1.setProductRatings(d1);
            pro1.setNumberofreviews(pro1.getNumberofreviews()+1);
		  ProductEntity q=	testrepositroy2.save(pro1);
		  return q;
			}
		else
		{
			ProductEntity p=new ProductEntity();
		p.setProductId(r.getProductId());
		p.setProductName(r.getProductName());
		p.setProductPrice(r.getProductPrice());
		p.setProductCategory(r.getCategory());
		p.setProductRatings(r.getProductRating());
		p.setNumberofreviews(1);
		ProductEntity q=testrepositroy2.save(p);
		return q;
		}
		
		}
	public boolean deleteproduct(int id, String name) {
		Optional<ProductEntity> p=testrepositroy2.findById(id);
		if(p.isPresent()) {
		testrepositroy2.deleteById(id);
		return true;
		}
		return false;
	}
	public ProductEntity Updateproduct(ProductEntity productEntity) {
		Optional<ProductEntity> p1=testrepositroy2.findById(productEntity.getProductId());
		ProductEntity p=testrepositroy2.getById(productEntity.getProductId());
		try {
			if(p1.isPresent())
			{
             p.setProductPrice(productEntity.getProductPrice());
			ProductEntity q=testrepositroy2.save(p);
			return q;
			}
		} 
		catch (Exception e) {
			
		}
		return null;
		}
	public ProductEntity getProduct(int id) {
		if(testrepositroy2.findById(id).isPresent())
		{
		ProductEntity t=testrepositroy2.getById(id);
		return t;
		}
		return null;
	}
	}
