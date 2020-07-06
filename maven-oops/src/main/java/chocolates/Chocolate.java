package chocolates;

public class Chocolate {
	private String name;
	private float price;
	private float weight;
public Chocolate(String name,float price,float weight) {
	this.name=name;
	this.price=price;
	this.weight=weight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price=price;
}
public String toString() {
	return "chocolates\n"+"Name= "+name+'\n'+"price= "+price+'\n'+"weight= "+weight+'\n';
}
public float getWeight(float weight)
{
	return weight;
}
public void setWeight(float weight)
{
	this.weight=weight;
}
public int compareTo(Chocolate o)
{
	return(int)(this.getPrice()-o.getPrice());
}



		
	

}
