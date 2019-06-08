package com.demo.bean;

import java.util.Set;

public class Student {

	Set<String> set;

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "Student [set=" + set + "]";
	}
	
	
	
	
	
}
