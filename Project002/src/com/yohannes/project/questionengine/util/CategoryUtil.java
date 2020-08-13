package com.yohannes.project.questionengine.util;

import java.util.ArrayList;
import java.util.List;

import com.yohannes.project.quesionengine.doman.Category;
import com.yohannes.project.quesionengine.doman.Subject;

public class CategoryUtil {

	
	public static List<Category> getAllCategories() {		
		return getDummyCategories();		
	}
	
	public static List<Category> getCategoriesById(String id){
		return null;
	}
	
	public static List<Category> getDummyCategories() {		
		
		List<Category> categories = new ArrayList<Category>();
		for(int i=1; i< 5;i++) {
			Category category = new Category();
			category.setCategoryId("Category011"+i);
			category.setCategoryName("Category 0"+i);
			category.setCategoryIcon("categ_Icon_00"+i);
			//subject.setSubjects(subjects);
			//categories.add(null);

			categories.add(category);
		}
		return categories;		
	}
	
	
}
