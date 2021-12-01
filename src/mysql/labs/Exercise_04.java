package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
 */

import java.sql.*;
import java.util.ArrayList;

public class Exercise_04 {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

             /* Other examples include:
                 Class.forname("oracle.jdbc.driver.oracledriver");
                 Class.forName("org.postgresql.Driver");
                 Class.forName("mongodb.jdbc.mongodriver"); */


            // configure the "connection string" (below) with the following format
            // -------------------------------------
            // jdbc:/mysql://H.O.S.T:<PORT>/DATABASE
            // -------------------------------------
            // on our localhost we don't need the port ":3306", we will also
            // add the login credentials and one or more other arguments
            // within the connection String. Your username here is most
            // likely "root", unless you have already created
            // new database users. The default MySQL username is "root".


            // NOTE: depending on your version of MySQL, you may need to delete "&useSSL=false"
            // from the connection String below in order to connect to the database


            String connectionString = "jdbc:mysql://localhost/airlines?"
                    + "user=root&password=@34%25rdXsw@"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";


            // Example connection String to remote MySQL instance:
            // "jdbc:mysql://178.34.21.99:3306/codingnomads?user=root&password=3tr0ngP@33W0rd"


            // Setup the connection with the DB
            connection = DriverManager.getConnection(connectionString);


            // Statements allow us to issue SQL queries to the database
            statement = connection.createStatement();
            // Execute the query on the Statement, getting a ResultSet in return
//            resultSet = statement.executeQuery("select * from airlines.passengers");
            resultSet = statement.executeQuery("SELECT * FROM airlines.flights;");

            ArrayList<Flt> flts = new ArrayList<>();

            while (resultSet.next()) {
                int fltId = resultSet.getInt("flt_id");
                int rtID = resultSet.getInt("rt_id");
                int plID = resultSet.getInt("pl_id");
                String fltDay = resultSet.getString("flt_day");

                Flt f1 = new Flt(fltId, rtID, plID, fltDay);
                flts.add(f1);

                for(Flt flt : flts) {
                System.out.println(flt);
                System.out.println(flt.fltDay);
            }




            //ArrayList<Flight> flights = new ArrayList<>();

            // loop through the result set while there are more records
//            while (resultSet.next()) {
//                String passName = resultSet.getString("pass_name");
//                int fltId = resultSet.getInt("flt_id");
//                int fromAp = resultSet.getInt("from_ap");
//                String city = resultSet.getString("city");
//                String fltDay = resultSet.getString("flt_day");

//                Flight f1 = new Flight(passName, fltId, fromAp, city, fltDay);
//                flights.add(f1);

                // get the id, name and units fields from the result set and assign them to local variables
//                int id = resultSet.getInt("pass_id");
//                String name = resultSet.getString("pass_name");
//                int units = resultSet.getInt("credits");


                // print out the result
//                System.out.println("Course ID: " + id + " is " + name + " and has " + units + units);
//                System.out.println("passenger id: " + id + " is " + name);
            }

//            for(Flight flight : flights) {
//                System.out.println(flight);
//                System.out.println(flight.getCity());
//            }

        } catch (Exception exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            System.out.println("Exception occured - driver not found on classpath");
//            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }


        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */
    }

}
