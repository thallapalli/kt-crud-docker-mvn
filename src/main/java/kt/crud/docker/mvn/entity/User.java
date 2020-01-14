package kt.crud.docker.mvn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {
 @javax.persistence.Id
 @GeneratedValue
 private Long Id;
 private String name;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public User(Long id, String name) {
	super();
	Id = id;
	this.name = name;
}
public User() {
	super();
}
 
 
}
