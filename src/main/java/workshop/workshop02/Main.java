package workshop.workshop02;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Ekim ", "Aycicek", "ekimaycicek@gmail.com");
        User user2 = new User(2, "Emre ", "Esgi", "emreesgi@gmil.com");


        Category category1 = new Category(1, "Macbook ");
        Category category2 = new Category(1, "Akilli Saat ");


        Product product1 = new Product(1, "Apple ");
        Product product2 = new Product(1, "Apple" );


        Order order1 = new Order(1,  3 );
        Order order2 = new Order(2,  1 );


        System.out.println("Kullanici: " + user1.getName() + user1.getLastName() +user1.getEmail());
        System.out.println("Kategori: " + category1.getName());
        System.out.println("Urun: " + product1.getName());
        System.out.println("Siparis adedi: "  + order1.getQuantity());


    }
}
