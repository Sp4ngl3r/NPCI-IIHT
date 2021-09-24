// Assignment 1 : Implement Shopping Cart using Java Collections  

package assignment_24_09_2021;

import java.util.ArrayList;

public class Assignment1 {

    public static void main(String[] args) {
        System.out.println("The products in Stock are ");
        ProductsInStock productsInStock = new ProductsInStock();
        productsInStock.displayStoreItems();

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addProductToShoppingCart(1);
        shoppingCart.addProductToShoppingCart(2);
        shoppingCart.addProductToShoppingCart(1);
        shoppingCart.addProductToShoppingCart(3);
        shoppingCart.addProductToShoppingCart(3);
        shoppingCart.addProductToShoppingCart(1);

        System.out.println();
        shoppingCart.displayCart();

        shoppingCart.removeProduct(2);
        shoppingCart.removeProduct(2);
        shoppingCart.removeProduct(2);
        shoppingCart.removeProduct(1);
        shoppingCart.removeProduct(1);
        shoppingCart.removeProduct(3);

        System.out.println();
        shoppingCart.displayCart();

    }

}

class ShoppingCart {
    ArrayList<Product> shoppingCart = new ArrayList<>();

    void addProductToShoppingCart(int product_id) {
        addToCart(getProductByProductID(product_id));
    }

    void addToCart(Product product) {
        if(product.getStock()==0){
            System.out.println("This product can't be selected");
            return;
        }
        else{
            this.shoppingCart.add(product);
            product.setStock(product.getStock()-1);
        }
    }

    public void removeProduct(int product_id) {
        Product product = getProductByProductID(product_id);
        shoppingCart.remove(product);
    }

    Product getProductByProductID(int product_id) {
        ArrayList<Product> products = new ProductsInStock().getProducts();
        for (Product prod : products) {
            if (prod.getProductId() == product_id) {
                return prod;
            }
        }
        return null;
    }

    void displayCart() {
        for (Product product : this.shoppingCart) {
            product.displayProduct();
        }
    }
}

class Product {
    int product_id;
    String product_name;
    double value;
    int stock;

    Product(int product_id, String product_name, double value, int stock) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.value = value;
        this.stock = stock;
    }

    int getProductId() {
        return this.product_id;
    }

    void setProductId(int product_id) {
        this.product_id = product_id;
    }

    String getProductName() {
        return this.product_name;
    }

    void setProductName(String product_name) {
        this.product_name = product_name;
    }

    double getValue() {
        return this.value;
    }

    void getValue(double value) {
        this.value = value;
    }

    int getStock() {
        return stock;
    }

    void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        else if (getClass() != object.getClass())
            return false;
        else
            return true;
    }

    void displayProduct() {
        System.out.println("The product " + this.product_name + " with value of Rs." + this.value);
    }
}

class ProductsInStock {
    ArrayList<Product> products = new ArrayList<>();

    ProductsInStock() {
        initializeStoreItems();
    }

    ArrayList<Product> getProducts() {
        return products;
    }

    void initializeStoreItems() {
        String[] productNames = { "Cricket Bat", "Shirt", "Football" };
        double[] productValues = { 9000, 600, 500 };
        int[] stock = { 2, 5, 1 };

        for (int i = 0; i < productNames.length; i++) {
            this.products.add(new Product(i + 1, productNames[i], productValues[i], stock[i]));
        }
    }

    void displayStoreItems() {
        for (Product product : products) {
            System.out.println(product.getProductId() + " -> " + product.getProductName() + " with price of Rs."
                    + product.getValue() + " are in " + product.getStock() + " number of quantities");
        }
    }

}
