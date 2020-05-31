package core.less5;
// реалізувати можна багато інтергейсів у одному
// класі а наслідуватись тільки від одного
// в даному випадку це патерн фасад для 
// Header, Body, Footer з делегуванням їх методів
public class Engine implements Header, Body, Footer{

	private final Header header;
	
	private final Body body;
	
	private final Footer footer;

	public Engine(Header header, Body body, Footer footer) {
		this.header = header;
		this.body = body;
		this.footer = footer;
	}
	
	public void printPage(){
		printHeader();
		printBody();
		printFooter();
	}

	public void printHeader() {
		if(header!=null)
		header.printHeader();
	}

	public void printBody() {
		if(body!=null)
		body.printBody();
	}

	public void printFooter() {
		if(footer!=null)
		footer.printFooter();
	}
	
	
}