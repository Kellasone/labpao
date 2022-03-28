package prep;

import java.io.*;

public class MainWithObjects {
    public static void main(String[] args) {
        File myObj = new File("Lab7/src/prep/file.txt");
        TestClass testClass = new TestClass("String");
        System.out.println(testClass.getString());

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(myObj);
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            oos.writeObject(testClass);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream(myObj);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        ObjectInputStream ois = null;
//        try {
//            ois = new ObjectInputStream(fis);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        TestClass tc = null;
//        try {
//            tc = (TestClass) ois.readObject();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(tc.getString());
    }
}
