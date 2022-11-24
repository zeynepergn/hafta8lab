package animal;

public class main {

	public static void main(String[] args) {
		 Fish fi = new Fish("Boncuk");
	        Cat ct = new Cat("balım");
	        Fish fi2 = new Fish("Boncuk");
	        Cat ct2 = new Cat("Bal");
	        Spider s = new Spider();
	
	      s.spider();
	      s.walk();
	      s.eat();
	      System.out.println("\n");
	      System.out.println("Ben bir kediyim benim adım "+ct.getName());
	      ct.pet();
	      ct.eat();
	      System.out.println("Meow \n");
	      System.out.println("Ben bir balığım benim adım "+fi.getName());
	      fi.pet();
	      fi.walk();
	      fi.eat();
	      System.out.println("\n");
	      System.out.println("Ben bir kediyim benim adım "+ct2.getName());
	      ct2.pet();
	      ct2.eat();
	      
	      System.out.println("Meow \n");
	      System.out.println("Ben bir balığım benim adım "+fi2.getName());
	      fi2.walk();
	      fi2.eat();
	    

	}

}
