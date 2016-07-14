
public class Pokemon {
Boolean hastail;
String type; 
String name;

void attack(){
	System.out.println(name + " is attacking");
}
void heal(){
	System.out.println(name + " needs healing");
}

void rev(){
System.out.println(name + "");
}

public Pokemon(Boolean hastail, String type, String name) {
	super();
	this.hastail = hastail;
	this.type = type;
	this.name = name;
}


}
