import java.util.ArrayList;
import java.util.List;

// Invoice.java
public class Invoice {

    public static String generateInvoice(Payable payable) {
        List<Payable> payables = new ArrayList<>();
        payables.add(new Payable(12345, "John Doe", 1000.00));
        payables.add(new Payable(54321, "Jane Doe", 2000.00));

        String invoice = Invoice.generateInvoice((Payable) payables);

        System.out.println(invoice);

        return payable.generateInvoice();
    }
}
