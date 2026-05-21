package com.kajtek.springboot.learn_spring_boot;

public class Player {

	private long id;
	private String name;
	private String posistion;

	
	
	
	public Player(long id, String name, String posistion) {
		super();
		this.id = id;
		this.name = name;
		this.posistion = posistion;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPosistion() {
		return posistion;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", posistion=" + posistion + "]";
	}
}
