package spel.packages;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
		
		BookLibrary bookLibrary = context.getBean("bookLibrary", BookLibrary.class);
		
		List<Book> collection = bookLibrary.getAllBooks();
		for (Book book : collection) {
			System.out.println(book.getId() + "      " + book.getName());
		}
		System.out.println("----------------------------------------------");
		
		System.out.println(bookLibrary.getGetFirstBook().getId() + "        " + bookLibrary.getGetFirstBook().getName());
		((AbstractApplicationContext) context).close();
	}

}
