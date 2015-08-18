
public class SingleLink {

	private Person root = null;
	
	public void addLast(Person p){
		if(root == null){
			root = p;				// If list is empty, root is the first person
		}else{
			root.setNext(p);		// Adds a next value to the current root
			root = p; 				// Sets root as the last person in the list
		}
	}
	
}
