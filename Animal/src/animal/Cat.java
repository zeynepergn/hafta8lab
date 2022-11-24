package animal;

public class Cat extends Animal implements Pet{
	public Cat(int legs) {
        super(legs);
    }
    public Cat(String name) {
        super(4);
        this.name = name;
    }
    String name;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println("Meov.");
        
    } 
    public void pet() {
    	System.out.println("Evcil");
    }
	

}
