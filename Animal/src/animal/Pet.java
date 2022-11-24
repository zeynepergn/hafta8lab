package animal;

public interface Pet {
	String getName();
	  default void setName(String name) {
		  System.out.println("Bu Hayvan evcil hayvandır");
	  }
	  default void play() {
		  System.out.println("Bu Hayvan oyun oynar");
	  }
}
