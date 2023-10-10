package mediatheque;

public class VisitorPrint implements Visitor{
    @Override
    public String visit(Book book) {
        return book.toString();
    }

    @Override
    public String visit(CD cd) {
        return cd.toString();
    }
}
