package week1.homeAssignment;

public class Library {

	private static String book;

	public String addBook(String bookTitle) {
		System.out.println("Book added Successfully");
		System.out.println(bookTitle);
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued Successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj1 = new Library();

		String book = obj1.addBook("Harry potter");
		System.out.println("printing book title returned value "+book);
		obj1.issueBook();
	}

}
