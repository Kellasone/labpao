package jdbc;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    Connection conn = null;
    Statement stmt = null;


    public Database() {
        try {
            String url = "jdbc:mysql://root:root@localhost:3306/sys";
            conn = DriverManager.getConnection(url);

            System.out.println("Got it!");

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public ArrayList<Cat> getAllCats() {
        ArrayList<Cat> resultArray = new ArrayList<>();
        String query = "select * from cat";
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String breed = rs.getString(3);
                int age = rs.getInt(4);

                Cat cat = new Cat(id, name, breed, age);
                resultArray.add(cat);
            }
        } catch (SQLException e ) {
            throw new Error("Problem", e);
        }
        return resultArray;
    }

    public void addCat(Cat catToAdd) {
        String query = "insert into cat values ("+catToAdd.getId()+",\""+catToAdd.getName()+"\", \""+catToAdd.getBreed()+"\", "+catToAdd.getAge()+")";
        System.out.println(query);

//        try {
////            boolean rs = stmt.execute(query);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

        String asd = "a  \"asd\"sd";

    }

    public Cat getCatById(int id) {
        String query = "select * from cat where id=?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();


            while (rs.next()) {
                int catId = rs.getInt(1);
                String name = rs.getString(2);
                String breed = rs.getString(3);
                int age = rs.getInt(4);

                Cat cat = new Cat(catId, name, breed, age);
                return cat;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Cat getSpecialCat(int id, String cat_name) {
        String query = "select * from cat where id=? AND name = ?";
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.setString(2, cat_name);

            ResultSet rs = stmt.executeQuery();


            while (rs.next()) {
                int catId = rs.getInt(1);
                String name = rs.getString(2);
                String breed = rs.getString(3);
                int age = rs.getInt(4);

                Cat cat = new Cat(catId, name, breed, age);
                return cat;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}


/*
*
*
*
*  String query = "select * from test_table";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String id = rs.getString("id");
                    System.out.println(id);
                }
            } catch (SQLException e ) {
                throw new Error("Problem", e);
            }
*
* */