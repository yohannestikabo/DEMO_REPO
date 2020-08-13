package com.yohannes.project.questionengine.util;

import java.util.ArrayList;
import java.util.List;

import com.yohannes.project.quesionengine.doman.Menu;

public class MenuUtil {

	public static List<Menu> getAllMenus(){
		return getDummyMenus();
	}
	
	private List<Menu> getAllMenus(String menuId
			){
		return null;
	}
	
	private static List<Menu> getDummyMenus() {		
		
		List<Menu> menus = new ArrayList<Menu>();
		for(int i=0; i< 4;i++) {
			Menu parent = new Menu();
			parent.setMenuId("MenuID"+i);
			parent.setMenuName("MenuName"+i);
			Menu[] firstChildren = new Menu[4];
			
			for(int j=0; j<4;j++) {
				Menu firstChild = new Menu();
				firstChild.setMenuId("MenuID"+i+j);
				firstChild.setMenuName("MenuName"+i+j);
				Menu[] secondChildren = new Menu[4];
				for(int k=0; k<4;k++) {
					Menu secondChild = new Menu();
					secondChild.setMenuId("MenuID"+i+j+k);
					secondChild.setMenuName("MenuName"+i+j+k);
					secondChildren[k]=secondChild;
				}
				firstChild.setMenus(secondChildren);
				firstChildren[j]=firstChild;				
			}
			parent.setMenus(firstChildren);
			menus.add(parent);
		}
		return menus;		
	}
	
}
