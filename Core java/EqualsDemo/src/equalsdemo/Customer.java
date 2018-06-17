package equalsdemo;

public class Customer 
{
 private int id;
 private String name;
 private int age;
 private String email;

 public Customer() {
 }

 public Customer(int id, String name, int age, String email) {
  this.id = id;
  this.name = name;
  this.age = age;
  this.email = email;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
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

 @Override
 public boolean equals(Object obj) 
 {
  Customer c = (Customer)obj;
  if(this.id==c.id&&this.name.equals(c.name)&&this.age==c.age&&this.email.equals(c.email))
  {
   return true;
  }
  else
  {
   return false;
  }
 }
 
}
