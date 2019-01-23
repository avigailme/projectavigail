package database;

import java.sql.*;

public class DBWorker {

    private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "123456";

    public Connection connect(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the POSgreSQL server succesfully");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return  connection;
        }



        public int getActorCount(){
        String SQL= "SELECT count(*) FROM gruppa";
        int count = 0;

        String value = " ";
            String SQLText= "select tr.name,  lower(name)lowercasenames\n" +
                    "from trainers tr\n" +
                    "where lower (tr.name)like '%a%'";

        try(Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL)){
            resultSet.next();
            count = resultSet.getInt(1);
            value = resultSet.getString(1);
            System.out.println(value);
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;
        }

    public boolean getEverything(boolean something){

        String SQLname= "SELECT id, name FROM gruppa";
        String value = " ";
       // String SQLText= "select tr.name,  lower(name)lowercasenames\n" +
             //   "from trainers tr\n" +
               // "where lower (tr.name)like '%a%'";

        try(Connection connection = connect();
            Statement statement =  connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLname)){
           while (resultSet.next()){
               System.out.println( resultSet.getString("id") + " "
                               + resultSet.getString("name")
                       );

           };
            //count = resultSet.getInt(1);
           // value = resultSet.getString(1);
           // System.out.println(value);
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
       return true;
    }

    public static void main(String[] args) {
        DBWorker dbWorker = new DBWorker();

        System.out.println(dbWorker.getname()+ "students found");
    }

    public boolean getname(){
        String SQLt="Select g.*,s.name stname from groups g join students s on g.id=s.groups " +
                "where s.id=?";
        String str=" ";
        Connection connection = null;
       // int count = 0;
        try {
            connection=connect();
             PreparedStatement prep = connection.prepareStatement(SQLt);
             ResultSet rs=prep.executeQuery(SQLt);
            while(rs.next()){
                prep.setInt(1,2);
                ResultSet resultSet = prep.executeQuery();
                   }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return true;
    }
    }




