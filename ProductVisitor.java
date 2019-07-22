package shop;

public interface ProductVisitor {
public void singleProductVisit(SingleProduct prod);
public void packageVisit(Package pack);
}
