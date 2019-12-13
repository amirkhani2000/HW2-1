package Base;

public class Main {

    public static void main(String[] args) {

        Benz e = new E250();
        Benz c = new C250();
        Benz d = new E350();
        Benz f = new C200();
        Benz g = new S500();
        Benz[] BenzMarket = new Benz[]{e,c,d,f,g};
        for(Benz temp:BenzMarket){
            System.out.println(temp.getClass());
            System.out.println(temp.color);
            System.out.println(temp.price);
            System.out.println(temp.speed);
        }
    }
}
