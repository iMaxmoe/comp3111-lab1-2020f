/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    
    public static void main(String args[]) {
    	Library lib = new Library();
    	if (lib.someLibraryMethod()) {
        	System.out.println("When there is a fire, commit and push.");    		
    	}
    }
}
