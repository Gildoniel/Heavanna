import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbDataDao implements DataDao {
        String dbName;
        String user;
        String password;
        String host;
        String mainStoryTabName;
        String subStoryTabame;
        String mainStoryColName;
        String mainStoryColIdName;
        String subStoryColIdName;
        String subStoryColStoryIdName;
        String subStoryColSubtextName;
        String subStoryColTargetIdName;


        DbDataDao(String host, String dbName, String user, String password, String mainStoryTabName,String mainStoryColIdName, String mainStoryColName, String subStoryTabName,String subStoryColIdName,String subStoryColStoryIdName,String subStoryColSubtextName,String subStoryColTargetIdName) throws IOException {
            this.dbName = dbName;
            this.password = password;
            this.user = user;
            this.host = host;
            this.mainStoryTabName = mainStoryTabName;
            this.subStoryTabame = subStoryTabName;
            this.mainStoryColName = mainStoryColName;
            this.mainStoryColIdName = mainStoryColIdName;
            this.subStoryColIdName = subStoryColIdName;
            this.subStoryColStoryIdName = subStoryColStoryIdName;
            this.subStoryColSubtextName = subStoryColSubtextName;
            this.subStoryColTargetIdName = subStoryColTargetIdName;

        }

        public List<String> getData() throws IOException {
            Connection con;
            String line;
            List<String> data = new ArrayList<>();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", user, password);
            } catch(Exception e) {
                System.out.println(e.getStackTrace());
                con = null;
                return data;
            }
            try {
                Statement stmt = con.createStatement();
                ResultSet msrs = stmt.executeQuery("select * from " + mainStoryTabName);
                while (msrs.next()){
                    line = String.valueOf(msrs.getInt(mainStoryColIdName)) + ";" + msrs.getString(mainStoryColName);
                    data.add(line);
                }
                ResultSet ssrs = stmt.executeQuery("select * from " + subStoryTabame);
                while (ssrs.next()){
                    line = String.valueOf(ssrs.getInt(subStoryColIdName) + ";" + ssrs.getInt(subStoryColStoryIdName) + ";" + ssrs.getString(subStoryColSubtextName) + ";" + ssrs.getInt(subStoryColTargetIdName));
                    data.add(line);
                }
                con.close();
            } catch(Exception e) {
                System.out.println(e.getStackTrace());
                return data;
            }
            return data;
        }

    }
