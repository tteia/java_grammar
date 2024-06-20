package C09NetWorking;

import java.sql.*;

public class C0903DatabaseConnect {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false"; // mysql 드라이브가 필요.
        String userName = "root";
        String password = "dkdud";

        Connection con = DriverManager.getConnection(url, userName, password);

        System.out.println("DB 연결 성공");

        // statement : 쿼리를 담아 db로 쿼리 전달하는 객체
        Statement st = con.createStatement();
        String myQuery = "SELECT * FROM post"; // + "where id = " + id;
        ResultSet rs = st.executeQuery(myQuery);
        int id = 0;
        String title = "";
        while (rs.next()){
            id = rs.getInt("id");
            title = rs.getString("title");
            System.out.println("id는 " + id + ", title은 " + title + ".");
        }
    }
}
