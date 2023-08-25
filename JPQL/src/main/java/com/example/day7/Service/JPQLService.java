package com.example.day7.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day7.Model.JPQLModel;
import com.example.day7.Repository.JPQLRepo;

@Service
public class JPQLService {
	
		@Autowired
		public JPQLRepo hrepo;
		
		//post the data
		public String saveCafe(JPQLModel h)
		{
			hrepo.save(h);
			return "Data is saved to database";
		}
			
		//get all the data
		public List<JPQLModel> getAllrows()
		{
			return hrepo.getAllRows();
		}
				
		//get specific rows
		public List<JPQLModel> getSpecrows(String ci,String name)
		{
			return hrepo.getSpecRows(ci, name);
		}
		
		//get by name
		
		public List<JPQLModel> getbyname(String name)
		{
			return hrepo.getByname(name);
		}
		
		//delete the data
	
		public int deleterow(int id)
		{
			return hrepo.deletebyid(id);
		}
		
		//update the data
		
		public Integer updateRow(String ci,int id)
		{
			return hrepo.updateByid(ci, id);
		
		}

		public void saveJPQL(JPQLModel hr) {
			// TODO Auto-generated method stub
			
		}
}