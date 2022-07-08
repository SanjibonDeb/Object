package Object;

public class Creating_Object {
	public Creating_Object(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Passed Name is :" + name );
	   }

	   public static void main(String []args) {
	      // Following statement would create an object myPuppy
		   Creating_Object object = new Creating_Object( "tommy" );
	   }
}
