package com.springmvc.entity;

import java.util.List;

public class Choose {
	
	private boolean choose;
	private List<String> options;
	
	public boolean isChoose() {
		return choose;
	}
	public void setChoose(boolean choose) {
		this.choose = choose;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}


}
