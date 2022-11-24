package animal;

public class Fish extends Animal implements Pet {
	public String name;
    public Fish(String name) {
        super(0);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public void play() {
       System.out.println("ben oynarım");
    }
    public void walk(){
        System.out.println("ben yürüyorum");
    }
    public void pet() {
    	System.out.println("ben evcil bir hayvanım");

}
}    
