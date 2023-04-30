import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {



    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {
        //create XML
//        XML.createXml();

        int [] numbers = {1,2,3,4,5,6};
        average(numbers);
        averageOdd(numbers);

        Department depOne = new Department("Cyber Security", 15, "cybersecurity@gmail.com");
        Department depTwo = new Department("HR", 3, "hr@gmail.com");
        System.out.println(depOne.toString());
        System.out.println("Number of employees equals " + depOne.equals(depTwo));
        CreateFile.createFile("Lana Mezvrishvili");
    }

    public static void average(int[] nums) {
        double total = 0;
        if (nums.length < 150) {
            for (int i = 0; i < nums.length; i++) {
                total += nums[i];
            }
            System.out.println(total / nums.length);
        }
    }

    //#2
    public static void averageOdd(int[] nums) {
        double total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                total += nums[i];
            }
        }
    }
}