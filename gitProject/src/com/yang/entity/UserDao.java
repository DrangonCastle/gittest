package com.yang.entity;

//�⺻ ������, ����3�� �޴� ������, setter&getter
public class UserDao {
	private String name;
	private int age;
	private double score;
	
	public UserDao() {
		this.super();
	}
	
	public UserDao(String name,int age,double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void GetName() {
		return name;
	}
	public int GetAge() {
		return age;
	}
	public int GetScore() {
		return score;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public void SetAge(int age) {
		this.age = age;
	}
	public void SetScore(int score) {
		this.score = score;
	}
}