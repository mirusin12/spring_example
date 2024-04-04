package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewMapper reviewMapper;
	
	// input: int id
	// output: Review
	public Review getReview(int id) { // 필수 param 이니까 Integer 사용 X
		return reviewMapper.selectReview(id);
	}
	
	// input: Review
	// output: int(성공한 행의 개수)
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	// addReviewAsField(4, "콤비네이션R", "바다", 5.0, "역시 맛있다!");
	public int addReviewAsField(int storeId, String menu, String userName, double point,
			String review) {
		return reviewMapper.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	// input: id, review
	// output: int(성공한 행 개수)
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
	
	// input: int
	// output: X
	public void deleteReviewById(int id) {
		reviewMapper.deleteReviewById(id);
	}
	
}
