package week1.homeAssignment;

public class LibraryManagement  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj1 = new Library();

		String book = obj1.addBook("Harry potter");
		System.out.println("printing book title returned value "+book);
		obj1.issueBook();
	}

}
