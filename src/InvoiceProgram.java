public class InvoiceProgram {
    public static void main(String[] args) {

        // Faktura 1
        System.out.println("----- Invoice 1 -----");
        Invoice i1 = new Invoice();
        i1.number = 1;
        char[] descripton = {'b','o','o','k'};
        i1.description = descripton;
        i1.quantity = 2;
        i1.price = 32.10;
        i1.vat = 0.23;
        i1.fromNIP = 9581295437L;
        i1.forNIP = 7851770575L;

        System.out.println("Number: "+i1.number);
        System.out.print("Description: ");
        for (char c : i1.description){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Quantity: "+i1.quantity);
        System.out.println("Price: "+i1.price);
        System.out.println("VAT: "+i1.vat);
        System.out.println("From: "+i1.fromNIP);
        System.out.println("For: "+i1.forNIP);
        System.out.println();

        // Faktura 2
        System.out.println("----- Invoice 2 -----");
        Invoice i2 = new Invoice();
        i2.number = 2;
        char[] descripton2 = {'l','a','p','t','o','p'};
        i2.description = descripton2;
        i2.quantity = 3;
        i2.price = 2499.99;
        i2.vat = 0.23;
        i2.fromNIP = 9581295437L;
        i2.forNIP = 7851770575L;

        System.out.println("Number: "+i2.number);
        System.out.print("Description: ");
        for (char c : i2.description){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Quantity: "+i2.quantity);
        System.out.println("Price: "+i2.price);
        System.out.println("VAT: "+i2.vat);
        System.out.println("From: "+i2.fromNIP);
        System.out.println("For: "+i2.forNIP);
        System.out.println();

        // Przypisanie faktur do tablicy
        Invoice[] invoices = new Invoice[2];
        invoices[0] = i1;
        invoices[1] = i2;

        System.out.println("----- Invoices foreach ------");
        for(Invoice invoice : invoices){
            System.out.println("Number: "+invoice.number);
            System.out.print("Description: ");
            for (char c : invoice.description){
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Quantity: "+invoice.quantity);
            System.out.println("Price: "+invoice.price);
            System.out.println("VAT: "+invoice.vat);
            System.out.println("From: "+invoice.fromNIP);
            System.out.println("For: "+invoice.forNIP);
            System.out.println();
        }

    }
}
