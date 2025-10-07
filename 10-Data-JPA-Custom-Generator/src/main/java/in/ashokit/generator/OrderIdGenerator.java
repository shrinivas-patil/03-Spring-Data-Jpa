package in.ashokit.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "OD";
        String suffix = "";

        try {
            // Hibernate 6.x way to get JDBC connection
            Connection con = session.getJdbcConnectionAccess().obtainConnection();

            Statement stmt = con.createStatement();
            // Fetch last order_id from table
            String sql = "SELECT MAX(Order_id) FROM ORDER_DTLS";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                String lastId = rs.getString(1); // e.g., OD5
                if (lastId != null) {
                    int idNum = Integer.parseInt(lastId.replace(prefix, ""));
                    idNum++;
                    suffix = String.valueOf(idNum);
                } else {
                    suffix = "1"; // first record
                }
            } else {
                suffix = "1";
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return prefix + suffix;
    }
}
