/*Store procedure to insert employee Details in database:
Sql Statement:

DELIMITER //
CREATE PROCEDURE InsertEmployeeDetail(IN eid INT,IN name VARCHAR(50), IN address VARCHAR(50), IN salary INT)
BEGIN
    INSERT INTO employee (eid,name,address,salary) VALUES (eid,name, address, salary);
END;
//
DELIMITER ;


*/


package jdbcConnectivity;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Types;

public class CallableStatementExercise {

	public static void main(String[] args) {
		try (Connection con = ConnectDB.dbConnect();) {
			  // 3. Prepare the CallableStatement to call the stored procedure.
			 // 3. Prepare the CallableStatement to call the stored procedure.
            String callStatement = "{CALL InsertEmployeeDetail(?,?, ?, ?)}";
            CallableStatement callableStatement = con.prepareCall(callStatement);

            // 4. Set the input parameters (employee details).
            callableStatement.setInt(1, 7);
            callableStatement.setString(2, "Peter Doe");
            callableStatement.setString(3, "Software Engineer");
            callableStatement.setInt(4, 75000);

            // 5. Execute the stored procedure to insert a new employee.
            callableStatement.execute();

            // 6. Close the resources.
            callableStatement.close();
            System.out.println("Employee inserted successfully");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
