import java.io.*;
import java.util.*;
public class mergeBinary {
    public static void main(String[] args) {
        try {
            FileReader file1Open = new FileReader("product.txt");
            BufferedReader file1Reader = new BufferedReader(file1Open);
            ArrayList<String> ProductID = new ArrayList<>();
            ArrayList<String> ProductName = new ArrayList<>();
            ArrayList<Double> ProductPrice = new ArrayList<>();
            String line;
            while ((line = file1Reader.readLine()) != null){
                String[] arr = line.split(",");
                ProductID.add(arr[0]);
                ProductName.add(arr[1]);
                ProductPrice.add(Double.parseDouble(arr[2]));
            }
            System.out.println("product.txt");
            System.out.println("ProductID | ProductName | ProductPrice");
            for (int i = 0; i < ProductID.size() && i < ProductName.size() && i < ProductPrice.size(); i++){
                System.out.printf("%s | %s | %.2f\n",ProductID.get(i),ProductName.get(i),ProductPrice.get(i));
            }//unnecessary

            FileReader file2Open = new FileReader("order.txt");
            BufferedReader file2Reader = new BufferedReader(file2Open);
            ArrayList<String> OrderID = new ArrayList<>();
            ArrayList<String> ProductID_order = new ArrayList<>();
            ArrayList<Integer> OrderQuantity = new ArrayList<>();
            while ((line = file2Reader.readLine()) != null){
                String[] arr = line.split(",");
                OrderID.add(arr[0]);
                ProductID_order.add(arr[1]);
                OrderQuantity.add(Integer.parseInt(arr[2]));
            }
            System.out.println("order.txt");
            System.out.println("OrderID | ProductID | OrderQuantity");
            for (int i = 0; i < OrderID.size() && i < ProductID_order.size() && i < OrderQuantity.size(); i++){
                System.out.printf("%s | %s | %d\n",OrderID.get(i),ProductID_order.get(i),OrderQuantity.get(i));
            }//unnecessary

            ArrayList<String> ProductName_order = new ArrayList<>(Collections.nCopies(OrderID.size(), ""));
            ArrayList<Double> ProductPrice_order = new ArrayList<>(Collections.nCopies(OrderID.size(), 0.0));
            for (int i = 0; i < OrderID.size() && i < ProductID_order.size() && i < OrderQuantity.size(); i++){
                for (int j = 0; j < ProductID.size() && j < ProductName.size() && j < ProductPrice.size(); j++){
                    if (ProductID.get(j).equals(ProductID_order.get(i))){
                        ProductName_order.set(i,ProductName.get(j));
                        ProductPrice_order.set(i,ProductPrice.get(j));
                    }
                }
            }
            System.out.println("ProductID | ProductName | Quantity | PricePerUnit | Total");
            for (int i = 0; i < OrderID.size() && i < ProductID_order.size() && i < OrderQuantity.size(); i++){
                System.out.printf("%s | %s | %d | %.2f | %.2f\n",ProductID_order.get(i),ProductName_order.get(i),OrderQuantity.get(i),ProductPrice_order.get(i),OrderQuantity.get(i)*ProductPrice_order.get(i));
            }
            file1Open.close();
            file1Reader.close();
            file2Open.close();
            file2Reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}