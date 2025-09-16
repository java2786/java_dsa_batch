class MyProduct{
    String name;
    double price;

    MyProduct(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyProduct other = (MyProduct) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }
    
}

public class EqualsDemo {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 10;

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        if(a.equals(b)){
            System.out.println("A and B: Same");
        } else {
            System.out.println("A and B: Not same");
        }
        if(a.equals(c)){
            System.out.println("A and C: Same");
        } else {
            System.out.println("A and C: Not same");
        }


        MyProduct p1 = new MyProduct("Shirt", 400);
        MyProduct p2 = new MyProduct("Shirt", 400);
        MyProduct p3 = p1;
        if(p1.equals(p2)){
            System.out.println("p1 and p2: Same");
        } else {
            System.out.println("p1 and p2: Not same");
        }
        if(p1.equals(p3)){
            System.out.println("p1 and p3: Same");
        } else {
            System.out.println("p1 and p3: Not same");
        }
    }    
}
