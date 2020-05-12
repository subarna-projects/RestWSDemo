package com.subarna.Demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@Entity(name="aliens")
@Table(name="planet")
public class Alien {
	@Id
	public int id;
@Column(name="name")
private String name;
@Column(name="points")
private int points;
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setPoints(int points) {
	this.points = points;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPoints() {
	return points;
}
@Override
public String toString() {
	return "Alien [id=" + id + ", name=" + name + ", points=" + points + "]";
}


}
