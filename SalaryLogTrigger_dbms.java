/*
Create salary Log Table:
create table Salary_Log(log_id int primary key auto_increment,employee_id int,new_salary decimal(10,2),change_date timestamp default current_timestamp);

*/

package jdbcConnectivity;

import java.sql.Connection;
import java.sql.Statement;

public class SalaryLogTrigger {

	public static void main(String[] args) {

		try (Connection connection = ConnectDB.dbConnect(); Statement statement = connection.createStatement()) {

			// Define the SQL statement to create a trigger

			String createTriggerSQL = "CREATE TRIGGER update_salary_trigger\r\n" + "AFTER UPDATE ON employee\r\n"
					+ "FOR EACH ROW\r\n" + "BEGIN\r\n" + "    IF NEW.salary != OLD.salary THEN\r\n"
					+ "        INSERT INTO Salary_Log (employee_id, new_salary) VALUES (NEW.eid, NEW.salary);\r\n"
					+ "    END IF;\r\n" + "END;";

 // Execute the SQL statement to create the trigger
			statement.executeUpdate(createTriggerSQL);

			System.out.println("Trigger created successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
Not Run Sql command:
UPDATE employee SET salary =60000  WHERE eid =6;
*