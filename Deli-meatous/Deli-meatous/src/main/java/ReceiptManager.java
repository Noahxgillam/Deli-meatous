import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {
    public void generateReceipt(Order order) {
        String filePath = "src/main/resources/Receipts";

        String filename = filePath + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";

        try (FileWriter writer = new FileWriter(filename)) {

            writer.write(order.toString());
            System.out.println("Receipt saved: " + filename);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
