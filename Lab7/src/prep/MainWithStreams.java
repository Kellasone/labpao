package prep;

import java.io.*;

public class MainWithStreams {
    public static void main(String[] args) {
        File myObj = new File("Lab7/src/prep/file.txt");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(myObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        DataInputStream dis = new DataInputStream(fis);

        try {
            String fromFile = new String(dis.readAllBytes());
            System.out.println(fromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(myObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        DataOutputStream dos = new DataOutputStream(fos);

        try {
            dos.writeBytes("asdddddd");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
