package facade.design.pattern;

public class FacadePatternExample {

	public static void main(String[] args) {
		String test = "CheckElementPresent";

		WebExplorerHelperFacade.generateReports("firefox", "html", test);
		WebExplorerHelperFacade.generateReports("firefox", "junit", test);
		WebExplorerHelperFacade.generateReports("chrome", "html", test);
		WebExplorerHelperFacade.generateReports("chrome", "junit", test);
	}

}
