import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBtoCSV {
    String dbName;
    String user;
    String password;
    String host;
    String mainStoryTabName;
    String subStoryTabame;
    String writtenby;
    String mainStoryColName;
    String mainStoryColIdName;
    String subStoryColIdName;
    String subStoryColStoryIdName;
    String subStoryColSubtextName;
    String subStoryColTargetIdName;


    DBtoCSV(String host, String dbName, String user, String password, String mainStoryTabName,String mainStoryColIdName, String mainStoryColName, String subStoryTabName,String subStoryColIdName,String subStoryColStoryIdName,String subStoryColSubtextName,String subStoryColTargetIdName, String writtenby) throws IOException {
        this.dbName = dbName;
        this.password = password;
        this.user = user;
        this.host = host;
        this.mainStoryTabName = mainStoryTabName;
        this.subStoryTabame = subStoryTabName;
        this.writtenby = writtenby;
        this.mainStoryColName = mainStoryColName;
        this.mainStoryColIdName = mainStoryColIdName;
        this.subStoryColIdName = subStoryColIdName;
        this.subStoryColStoryIdName = subStoryColStoryIdName;
        this.subStoryColSubtextName = subStoryColSubtextName;
        this.subStoryColTargetIdName = subStoryColTargetIdName;

    }

    public boolean writeDBtoCSV() throws IOException {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", user, password);
        } catch(Exception e) {
            System.out.println(e.getStackTrace());
            con = null;
        }
        String line;
        File storyFile = new File(writtenby + ".csv");
        storyFile.createNewFile();
        System.out.println(storyFile.getAbsoluteFile());
        try {
            Statement stmt = con.createStatement();
            ResultSet msrs = stmt.executeQuery("select * from " + mainStoryTabName);
            FileWriter writer = new FileWriter(writtenby + ".csv", true);
            BufferedWriter output = new BufferedWriter(writer);
            System.out.println("1");
            while (msrs.next()){
                line = String.valueOf(msrs.getInt(mainStoryColIdName)) + ";" + msrs.getString(mainStoryColName);
                System.out.println(line);
                output.write(line);
                output.newLine();
            }
            ResultSet ssrs = stmt.executeQuery("select * from " + subStoryTabame);
            while (ssrs.next()){
                line = String.valueOf(ssrs.getInt(subStoryColIdName) + ";" + ssrs.getInt(subStoryColStoryIdName) + ";" + ssrs.getString(subStoryColSubtextName) + ";" + ssrs.getInt(subStoryColTargetIdName));
                System.out.println(line);
                output.write(line);
                output.newLine();
            }
            output.close();
            con.close();
            return true;
        } catch(Exception e) {
            System.out.println(e.getStackTrace());

        }
        return false;
    }

}
