/*First create Products table-
create table products(product_id int primary key auto_increment,product_name varchar(10),price decimal(10,2));

create Product_Metadata table-
create table Product_Metadata(product_id int,last_modified Timestamp default CURRENT_TIMESTAMP ON uPDATE CURRENT_TIMESTAMP);
*/

package jdbcConnectivity;

import java.sql.Connection;
import java.sql.Statement;

public class ProductTrigger {

	public static void main(String[] args) {

		try (Connection connection = ConnectDB.dbConnect(); Statement statement = connection.createStatement()) {

			// Define the SQL statement to create a trigger
            
	         

			String createTriggerSQL = "CREATE TRIGGER update_last_modified_trigger\r\n" + "AFTER INSERT ON Products\r\n"
					+ "FOR EACH ROW\r\n" + "BEGIN\r\n"
					+ "    INSERT INTO Product_Metadata (product_id) VALUES (NEW.product_id)\r\n"
					+ "    ON DUPLICATE KEY UPDATE last_modified = CURRENT_TIMESTAMP;\r\n" + "END;";
   // Execute the SQL statement to create the trigger
			statement.executeUpdate(createTriggerSQL);

			System.out.println("Trigger created successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
Run Insert query ffrom SQL CommandLine client
INSERT INTO Products (product_name, price) VALUES ("phone", 60000);
*/