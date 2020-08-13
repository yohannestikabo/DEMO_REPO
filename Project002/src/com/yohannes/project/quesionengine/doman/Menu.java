package com.yohannes.project.quesionengine.doman;

public class Menu {

	private String menuId;
	private String menuName;
	private String menuDescription;
	private Menu []  menus;
	
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuDescription() {
		return menuDescription;
	}
	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}
	public Menu[] getMenus() {
		return menus;
	}
	public void setMenus(Menu[] menus) {
		this.menus = menus;
	}
	
	
}
