package encaplation_constructor;

public class Library {

	public static void main(String[] args) {

		Book book1 = new Book();

		// it gave us error because it is private and, it is protected in class,
		// we cannot use outside class

		// book1.title= "Silence"; it is name same class with private one
		// but we can do with set

		book1.setTitle("Silence");
		System.out.println(book1.getTitle());
//		book1.author= "Mike Smith";

		book1.setAuthor("Mike Smith");
		System.out.println(book1.getAuthor());
//		book1.pages =321;

		book1.setPages(321);
		System.out.println(book1.getPages());
		
		
		Book javaBook = new Book();

		javaBook.setTitle("HeadFirst Java");

		javaBook.setAuthor("bla bla blaa");
		
		javaBook.setPages(700);
		
		System.out.println(javaBook.getTitle());
		System.out.println(javaBook.getAuthor());
		System.out.println(javaBook.getPages());

}
}
