package com.mycompany.voteapp;

public class Student {
	private String username;
	private String password;
	private String NIS;
	private String name;
	private String class_;
	private boolean voted;

	public Student() {
	}

	public Student(String username, String password, String NIS, String name, String class_, boolean voted) {
		this.username = username;
		this.password = password;
		this.NIS = NIS;
		this.name = name;
		this.class_ = class_;
		this.voted = voted;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNIS() {
		return NIS;
	}

	public void setNIS(String NIS) {
		this.NIS = NIS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClass_() {
		return class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public boolean isVoted() {
		return voted;
	}

	public void setVoted(boolean voted) {
		this.voted = voted;
	}


	
}
