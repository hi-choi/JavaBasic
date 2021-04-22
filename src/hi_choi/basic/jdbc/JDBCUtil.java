package hi_choi.basic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JDBCUtil {

        private ResourceBundle rb = null;
        private String DRV;
        private String URL;
        private String USR;
        private String PWD;

        public JDBCUtil() {
            String pkpath = "hi_choi.basic.jdbc.jdbc";
            // hi_choi.basic.jdbc : 패키지 경로
            // jdbc : properties 파일명
            rb = ResourceBundle.getBundle(pkpath);
            DRV = rb.getString("mdrv");
            URL = rb.getString("murl");
            USR = rb.getString("musr");
            PWD = rb.getString("mpwd");

        }

        public Connection openConn(){
            Connection conn = null;
            try {
                Class.forName(DRV);
                conn = DriverManager.getConnection(URL,USR,PWD);

            }catch(Exception ex) {
                ex.printStackTrace();
            }
            return conn;
        }
}

