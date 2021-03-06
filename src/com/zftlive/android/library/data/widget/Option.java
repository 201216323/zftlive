package com.zftlive.android.library.data.widget;

import com.zftlive.android.library.data.DTB;

/**
 * 下拉框、单选框、复选框选项Bean
 * @author 曾繁添
 * @version 1.0
 */
public class Option extends DTB{

	private static final long serialVersionUID = -724868344947644938L;

	private String label = "请选择...";
	
	private String value = "";
	
	public Option() {
		
	}

	public Option(String value,String label) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return label;
	}
	
	
}
