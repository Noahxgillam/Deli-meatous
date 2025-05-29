import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receiptmanager {
    public void generateReceipt(Order order) {
        String filePath = "C:/Users/Student/pluralsight/LearnToCode_Capstones/Deli-meatous/Deli-meatous/src/main/java/Receipts";

        String filename = filePath + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";

        try (FileWriter writer = new FileWriter(filename)) {

            writer.write(order.toString());
            System.out.println("Receipt saved: " + filename);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
