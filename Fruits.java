public class fruits {
    String name;
    String color;
    double price;

    fruits(String a, String b, double c) {
        name = a;
        color = b;
        price = c;
    }
    double getPrice(int n) {
        return price*n;
    }

    public static void main(String[] args) {
        fruits mango = new fruits("Mango", "Yellow", 60.70);  
        double price = mango.getPrice(67);
        System.out.println(price);
        
    }
}
