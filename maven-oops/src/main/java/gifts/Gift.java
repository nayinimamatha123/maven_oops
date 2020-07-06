package gifts;
import java.util.*;
import chocolates.Chocolate;
import sweets.Sweet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
abstract public class Gift {
	private ArrayList<Chocolate> chocolates;
	private ArrayList<Sweet> sweets;

	public abstract ArrayList<Chocolate>chocolates();
	private ArrayList<Sweet>sweets() {
		return null;
	}	public Gift() {

	this.chocolates=new ArrayList<Chocolate>();
	this.sweets=new ArrayList<Sweet>();
}
public boolean addChocolates(Chocolate... chocolates) {
    try {
        this.chocolates.addAll(Arrays.asList(chocolates));
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
public boolean addSweets(Sweet... sweets) {
    try {
        this.sweets.addAll(Arrays.asList(sweets));
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
public void sort() {
    Collections.sort(chocolates);
    Collections.sort(sweets);
}
public float findTotalWeight() {
    return this.chocolates.stream()
            .map(Chocolate::getWeight)
            .reduce(0.0f, float::sum)
            +
            this.sweets.stream()
                    .map(Sweet::getWeight)
                    .reduce(0.0f,float::sum);
}
	
public float findTotalPrice() {
    return this.chocolates.stream()
            .map(Chocolate::getPrice)
            .reduce(0.0f, Float::sum)
            +
            this.sweets.stream()
                    .map(Sweet::getPrice)
                    .reduce(0.0f, Float::sum);

}
public ArrayList<Chocolate> getChocolates() {
    return chocolates;
}

public void setChocolates(ArrayList<Chocolate> chocolates) {
    this.chocolates = chocolates;
}

public ArrayList<Sweet> getSweets() {
    return sweets;
}

public void setSweets(ArrayList<Sweet> sweets) {
    this.sweets = sweets;
}

}


	


