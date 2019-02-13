package Development;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;



public class ShopList {



    public static void main(String[] args) {



        ArrayList<Shop> InvoiceArrayList = new ArrayList<>();

        Shop itm1 = new Shop();

        itm1.setItemNumber(JOptionPane.showInputDialog(null,"Enter Item number: "));
        itm1.setItemName(JOptionPane.showInputDialog(null,"Enter Item name: "));
        //custName.toString();
        double price = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter item price: "));
        itm1.setItemPrice(price);
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter amount: "));
        itm1.setAmount(quantity);
        InvoiceArrayList.add(itm1);



        Shop itm2 = new Shop();

        itm2.setItemNumber(JOptionPane.showInputDialog(null,"Enter Item number: "));

        itm2.setItemName(JOptionPane.showInputDialog(null,"Enter Item name: "));
        double price2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter item price: "));
        itm2.setItemPrice(price2);
        int quantity2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter amount: "));
        itm2.setAmount(quantity2);
        InvoiceArrayList.add(itm2);


        Shop itm3 = new Shop();

        itm3.setItemNumber(JOptionPane.showInputDialog(null,"Enter Item number: "));
        itm3.setItemName(JOptionPane.showInputDialog(null,"Enter Item name: "));
        double price3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter item price: "));
        itm3.setItemPrice(price3);
        int quantity3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter amount: "));
        itm3.setAmount(quantity3);
        InvoiceArrayList.add(itm3);



        StringBuilder builder = new StringBuilder();


        builder.append("Item: ").append(itm1.getItemNumber()).append("     ").append(itm1.getItemName()).append("       ").append(itm1.getItemPrice()).append("     ").append(itm1.getAmount()).append("\n")
                .append("Item: ").append(itm2.getItemNumber()).append("     ").append(itm2.getItemName()).append("       ").append(itm2.getItemPrice()).append("     ").append(itm2.getAmount()).append("\n")
                .append("Item: ").append(itm3.getItemNumber()).append("     ").append(itm3.getItemName()).append("       ").append(itm3.getItemPrice()).append("     ").append(itm3.getAmount());

        JOptionPane.showMessageDialog(null,""+ builder.toString());

        StringBuilder builder2 = new StringBuilder();
        builder2.append("Total: R").append(itm1.calcPaymentAmount()).append("\n")
                .append("Total: R").append(itm2.calcPaymentAmount()).append("\n")
                .append("Total: R").append(itm3.calcPaymentAmount());


        JOptionPane.showMessageDialog(null,""+builder2.toString());


    }

}

