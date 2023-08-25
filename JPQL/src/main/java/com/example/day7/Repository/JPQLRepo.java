package com.example.day7.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.day7.Model.JPQLModel;

import jakarta.transaction.Transactional;

public interface JPQLRepo extends JpaRepository<JPQLModel, Integer> {
	//native Query
	
		@Query(value="select * from drinks", nativeQuery = true)
		public List<JPQLModel> getAllRows();
		
		@Query(value="select * from Drinks where shopName like %?1%",nativeQuery = true)
		public List<JPQLModel> getByname(@Param("name") String name);
			
		@Query(value="select * from Drinks where city=:ci and shopNname=:name",nativeQuery = true )
		public List<JPQLModel> getSpecRows(@Param("ci") String ci,@Param("name") String name);
			
		//Delete using native query
		
		@Modifying
		@Transactional
		@Query(value="delete from Drinks where cafe_id=:id",nativeQuery=true)
		public int deletebyid(@Param("id") int id);
        //Update the native query
		
		@Modifying
		@Transactional
		@Query(value="update Drinks set city=:ci where shop_id=:id",nativeQuery = true)
		public Integer updateByid(@Param("ci") String ci,@Param("id") int id);
}