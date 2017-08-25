package springboot.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AppUser")
public class AppUser implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
  @Id
  @Column(name = "id")
  private int id;

  @Column(name = "username")
  private String username;

protected AppUser(){
	
}
public AppUser(int id,String username){
	this.id = id;
	this.username = username;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

}