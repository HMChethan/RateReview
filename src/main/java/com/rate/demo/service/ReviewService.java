package com.rate.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rate.demo.model.ReviewEntity;
import com.rate.demo.repositroy.Reviewrepositroy;

@Service
public class ReviewService {

	@Autowired
	private Reviewrepositroy testrepositroy1;
	public List<ReviewEntity> getReviw() {
		List<ReviewEntity> list=new ArrayList<>();
	ReviewEntity r=new ReviewEntity(1,101,"LAPTOP",4.5,"GOOD",45000,"electronics", 10-10-2021l, 20-10-2022l);
		list.add(r);
		return list;
		}
	public ReviewEntity addReview(ReviewEntity  reviewtable) {
		ReviewEntity r=testrepositroy1.save(reviewtable);
		return r;
   }
//	public double getTopreview(int pid ,String productname) {
//		double large=testrepositroy1.getById(pid).getProductRating();
//		ReviewEntity id=testrepositroy1.getById(pid);
//   try {
//		for(int i=pid;i<=15;i++)
//		{
//			if(productname.equalsIgnoreCase(testrepositroy1.getById(i).getProductName()))
//			{
//				ReviewEntity r=testrepositroy1.getById(i);
//        	    String s=r.getProductName();
//				 if(r.getProductRating()>large)
//			         {
//					large=r.getProductRating();
//					
//               }
//			}
//		}
//   }
//   catch (Exception e) {
//	}
//     return large;
//		
//	}
	public List<ReviewEntity> getallreview(int id) {
    List<ReviewEntity> reviewEntity=  testrepositroy1.getByProductId(id);
    
		return reviewEntity;
	}

	
}
	

