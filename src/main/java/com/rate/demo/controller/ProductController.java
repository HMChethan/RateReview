package com.rate.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rate.demo.model.ProductEntity;
import com.rate.demo.service.ProductService;

public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/getproduct")
	public ResponseEntity<ProductEntity> getProduct(@RequestHeader("id") int id)
	{
		 ProductEntity p =  productService.getProduct(id);
		if(p!=null)
		{
			return ResponseEntity.ok(p);
		}
		else {
		return ResponseEntity.status(401).body(null);
		}
	}
	@RequestMapping("/deleteproduct")
	public  ResponseEntity<Boolean> deleteproduct(@RequestHeader("id") int id,@RequestHeader("name") String name)
	{
		boolean res=productService.deleteproduct(id,name);
	if(res) {
		return ResponseEntity.ok(res);}
	else {
		return ResponseEntity.status(401).body(null);
	}
		
	}
	@RequestMapping("/updateproduct")
	public ResponseEntity<ProductEntity> updateProduct(@RequestBody ProductEntity productEntity)
	{
		
	   ProductEntity productEntity2=  productService.Updateproduct(productEntity);
	   if(productEntity2!=null)
	   {
		   return ResponseEntity.ok(productEntity2);
	   }
		return ResponseEntity.status(401).body(null); 
		
	}

}
