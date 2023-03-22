package com.rate.demo.controller;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rate.demo.model.ProductEntity;
import com.rate.demo.model.ReviewEntity;
import com.rate.demo.service.ClientService;
import com.rate.demo.service.ProductService;
import com.rate.demo.service.ReviewService;
@RestController
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/getreview",method = RequestMethod.GET)
	public ResponseEntity<List<ReviewEntity>> getAllreview()  throws JsonMappingException,
	JsonProcessingException
	{
      List<ReviewEntity> c=reviewService.getReviw();
		
		return ResponseEntity.ok(c);
		
	}
	@RequestMapping(value="/addreview",method = RequestMethod.POST)
  public ResponseEntity<ProductEntity> getAllreviews(@RequestHeader Map<String, String> client, @RequestBody ReviewEntity reviewentity)  throws JsonMappingException, JsonProcessingException
	{  
      boolean result=clientService.verifydetails(client);
		if(result)
		{
		    String s="login sucessful";
		  ReviewEntity r= reviewService.addReview(reviewentity);
		  ProductEntity p= productService.addProduct(reviewentity);
		    return ResponseEntity.ok(p);
		 }
		else
		{
			return ResponseEntity.status(401).body(null);
		}
	 }
	@RequestMapping(value = "/gettopreview",method = RequestMethod.GET)
	 public ResponseEntity<Double> getTopreviews(@RequestHeader("pid") int pid, @RequestHeader("productname")String productname )  throws JsonMappingException, JsonProcessingException
		{
			double largereview=reviewService.getTopreview(pid,productname);
		 
			 return ResponseEntity.ok(largereview);
			 }
	@RequestMapping("/getallreviewonproduct")
	 public ResponseEntity<List<ReviewEntity>> getTopreviews(@RequestHeader("key") int id)  throws JsonMappingException, JsonProcessingException
		{
			List<ReviewEntity> r=reviewService.getallreview(id);
		 
			 return ResponseEntity.ok(r);
		 }

}
