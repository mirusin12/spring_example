package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {
	public Review selectReview(int id);
	
	// Mybatis가 성고한 행의 개수 return
	public int insertReview(Review review);
	
	// @Param => 하나의 Map
	public int insertReviewAsField(
			// 변수명 바꿔도 무관
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") double point,
			@Param("review") String review);
	
	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review);
	public void deleteReviewById(int id);
	
}
