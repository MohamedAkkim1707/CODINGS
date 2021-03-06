package com.javatpoint.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student 
{
@Id
@Column(name = "id", updatable = false)
private int id;
@Column(name = "name", nullable=false)
private String name;
@Column(name = "age", nullable=false)
private int age;
@Column(name = "email", nullable = false)
private String email;
public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
public String getName() 
{
return name;
}
public void setName(String name) 
{
this.name = name;
}
public int getAge() 
{
return age;
}
public void setAge(int age) 
{
this.age = age;
}
public String getEmail() 
{
return email;
}
public void setEmail(String email) 
{
this.email = email;
}
}