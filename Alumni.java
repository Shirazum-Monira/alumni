public class Alumni {
public String name;
public String grad_year;
public String email;
public String address;
public int id;
public Alumni(String name,String grad_year,String email,String address,int id){
	this.name=name;
	this.grad_year=grad_year;
	this.email=email;
	this.address=address;
	this.id=id;
}
public String getName(){
	return name;
}
public String getGrad_year(){
	return grad_year;
}
public String getEmail(){
	return email;
}
public String getAddress(){
	return address;
}
public int getId(){
	return id;
}
public void setName(String name){
	this.name=name;
}
public void setGrad_year(String grad_year){
	this.grad_year=grad_year;
}
public void setEmail(String email){
	this.email=email;
}
public void setAddress(String address){
	this.address=address;
}
public void setId(int id){
	this.id=id;
}
public String toString(){
	return name+","+grad_year+","+email+","+address+","+id;
}
}
