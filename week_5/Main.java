import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        // deleteClient(6);
        // showTable("clients");
        // addCake(7779,"strawberry","cake","circle",800,"2021-05-10","2021-05-15");
        // showTable("kulikovsky");
        // updateCake("Princess",7779);
    }

//Установить свзяь

    private static Connection getConnection() throws SQLException {
        final String username = "root";
        final String password = "Polikek_118";
        final String url = "jdbc:mysql://localhost:3306/week4";
        Connection connection=DriverManager.getConnection(url, username, password);
        try {
            connection  = DriverManager.getConnection(url, username, password);
        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return connection;
    }

//Вывести таблицу

    private static void showTable(String table) throws SQLException {

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        String myRSet = "SELECT * FROM " + table;
        ResultSet resultSet = statement.executeQuery(myRSet);
        if(resultSet != null) {
            try {
                ResultSetMetaData metadata = resultSet.getMetaData();
                int columnCount = metadata.getColumnCount();

                System.out.println("\n");
                while (resultSet.next()) {
                    for (int i = 1; i <= columnCount; i++)
                        System.out.print(resultSet.getString(i) + "\t");
                    System.out.println();
                }
            } catch (SQLException e){
                e.printStackTrace();
            } finally {
                try {
                    if(resultSet != null)
                        resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//Удаление

    private static void deleteClient(int id) throws SQLException {
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement pStatement  = null;
            try {
                pStatement = connection.prepareStatement("DELETE FROM clients WHERE id = ?;");
                pStatement.setInt(1, id);
                int cake = pStatement.executeUpdate();
                System.out.println(id + " was deleted");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    pStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//Добавление

    private static void addCake (int id, String name, String type, String shape, double price, String dateOfManufacture, String dateOfExpiration) throws SQLException {
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement pStatement = null;
            try {
                pStatement = connection.prepareStatement("insert into kulikovsky (id, name, type, shape, price, dateOfManufacture, dateOfExpiration)" +
                        " values(?, ?, ?, ?, ?, ?, ?)");
                pStatement.setInt(1, id);
                pStatement.setString(2, name );
                pStatement.setString(3, type);
                pStatement.setString(4, shape);
                pStatement.setDouble(5, price);
                pStatement.setString(6, dateOfManufacture);
                pStatement.setString(7, dateOfExpiration);

                int cake = pStatement.executeUpdate();
                System.out.println("new cake were added");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    pStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//Обновление

    private static void updateCake(String name, int id) throws SQLException{
        Connection connection = getConnection();

        if(connection != null) {
            PreparedStatement pStatement = null;
            try {
                pStatement = connection.prepareStatement("UPDATE kulikovsky SET name = ? WHERE id = ?");
                pStatement.setString(1, name);
                pStatement.setInt(2, id);
                int cake = pStatement.executeUpdate();
                System.out.println(id + " was updated");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    pStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}