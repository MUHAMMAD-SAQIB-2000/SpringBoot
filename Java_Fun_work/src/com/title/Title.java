package com.title;

public class Title {
	
	private int id;
	private String name;
	private String desc;
	private long price;
	
	
	public String toString() {
		return "Title [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}

	public Title(int id, String name, String desc, Long price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}

}
