public class FastenerStock {
    public static void main(String[] args) {

        // Przechowanie danych
        Fastener f1 = new Fastener();
        char[] name = {'B','o','l','t',' ','D','9','1','2'};
        f1.name = name;
        f1.diameter = 1.4;
        f1.length = 6.0;
        char[] number = {'0','7','0','0','0','.','0','1','4','.','0','0','6'};
        f1.number = number;
        f1.price = 284.49;
        f1.unit = 100;
        char[] stock = {'O','u','t',' ','o','f',' ','s','t','o','c','k'};
        f1.stock = stock;

        Fastener f2 = new Fastener();
        char[] name2 = {'B','o','l','t',' ','D','9','1','2'};
        f2.name = name2;
        f2.diameter = 1.6;
        f2.length = 5.0;
        char[] number2 = {'0','7','0','0','0','.','0','1','6','.','0','0','5'};
        f2.number = number2;
        f2.price = 2184.49;
        f2.unit = 1000;
        char[] stock2 = {'O','u','t',' ','o','f',' ','s','t','o','c','k'};
        f2.stock = stock2;

        Fastener f3 = new Fastener();
        char[] name3 = {'B','o','l','t',' ','D','9','1','2'};
        f3.name = name3;
        f3.diameter = 2.5;
        f3.length = 25;
        char[] number3 = {'0','7','0','0','0','.','0','2','5','.','0','2','5'};
        f3.number = number3;
        f3.price = 8.55;
        f3.unit = 100;
        char[] stock3 = {'O','n',' ','s','t','o','c','k'};
        f3.stock = stock3;

        Fastener f4 = new Fastener();
        char[] name4 = {'B','o','l','t',' ','D','9','1','2'};
        f4.name = name4;
        f4.diameter = 3.0;
        f4.length = 60;
        char[] number4 = {'0','7','0','0','0','.','0','3','0','.','0','6','0'};
        f4.number = number4;
        f4.price = 20.08;
        f4.unit = 50;
        char[] stock4 = {'O','n',' ','s','t','o','c','k'};
        f4.stock = stock4;

        // Wyświetlenie danych
        Fastener[] fasteners = new Fastener[4];
        fasteners[0] = f1;
        fasteners[1] = f2;
        fasteners[2] = f3;
        fasteners[3] = f4;

        System.out.println();
        System.out.println("----- BOLTS -----");
        System.out.println();
        for(Fastener fastener : fasteners){
            System.out.print("Name: ");
            for(char c : fastener.name){
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Diameter: "+fastener.diameter);
            System.out.println("Length: "+fastener.length);
            System.out.print("Number: ");
            for(char n : fastener.number){
                System.out.print(n);
            }
            System.out.println();
            System.out.println("Price: "+fastener.price);
            System.out.println("Unit: "+fastener.unit);
            System.out.print("Status: ");
            for(char s : fastener.stock ){
                System.out.print(s);
            }
            System.out.println();
            System.out.println();
        }
    }
}
