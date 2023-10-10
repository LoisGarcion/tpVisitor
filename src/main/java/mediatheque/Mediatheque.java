package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	private final VisitorPrint visitorPrint = new VisitorPrint();

	private final VisitorPrintBook visitorPrintBook = new VisitorPrintBook();

	private final VisitorPrintCD visitorPrintCD = new VisitorPrintCD();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items) {
			System.out.println(i.accept(visitorPrint));
		}
	}
	
	public void printOnlyBooks() {
		for (Item i : items) {
			System.out.println(i.accept(visitorPrintBook));
		}
	}

	public void printOnlyCDs() {
		for (Item i : items) {
			System.out.println(i.accept(visitorPrintCD));
		}
	}
}
