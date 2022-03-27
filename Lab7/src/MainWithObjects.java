import java.io.*;

public class MainWithObjects {
    public static void main(String[] args) {
        File myObj = new File("Lab7/src/file.txt");


        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(myObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileInputStream fis = null;
        try {
            fis = new FileInputStream(myObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
