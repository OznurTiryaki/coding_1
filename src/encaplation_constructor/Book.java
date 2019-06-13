package encaplation_constructor;

public class Book {

	private String title; // private yapinca bunlar degistirilemiyor
	private String author;
	private int pages;

	// it gave us error if we open the different class ,because it is private and,
	// it is protected in class,
	// we cannot use outside class

//what we need to do to access , somebody need to access to work with this information

	public void setTitle(String newTitle) { // setters //setters not necessary to return something
		title = newTitle; // its mean it take new title and assign title because it is not have a access
							// directly
	}

	public String getTitle() { // getters
		return title;
	}

	public String getAuthor() { // getters
		return author;

	}

	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}

	public int getPages() { // getters don't take any parameters
		return pages;

	}

	public void setPages(int newpages) {
		pages = newpages;

	}
}

///ayni class icinde yapiyorsan getters setters a gerek yok
