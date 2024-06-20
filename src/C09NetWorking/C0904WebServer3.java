package C09NetWorking;

// Author 테이블 생성. (id, name, email, password, pk(id)).
// 사용자가 localhost:8081?id=1 요청 시, name/email/password 응답.
// 사용자가 localhost:8001?name=hong&email=hong@naver.com / name = ~~ / email = ~~ / password = ~~

import java.sql.*;

public class C0904WebServer3 {
    public static void main(String[] args) throws SQLException {
        StringBuilder sb = new StringBuilder();

        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false"; // mysql 드라이브가 필요.
        String userName = "root";
        String password = "dkdud9988@";

        Connection con = DriverManager.getConnection(url, userName, password);

        String requestString = sb.toString();
        String firstLine = requestString.split("\n")[0];
        String infos = firstLine.split(" ")[1];
        System.out.println(infos);
        String tmpId = "";
        int id = 0;
        if(infos.contains("?")){
            String st1 = infos.split("\\?")[1];
            String[] stArr = st1.split("&");
            for(String s : stArr){
                String[] keyValue = s.split("=");
                if(keyValue[0].equals("id")){
                    tmpId = keyValue[1];
                    id = Integer.parseInt(tmpId);
                }
            }
        }

        Statement st = con.createStatement();
        String myQuery = "SELECT * FROM author" + " where id = " + id; // + "where id = " + id;
        ResultSet rs = st.executeQuery(myQuery);

        String name = "";
        String email = "";
//        String password = "";

        while (rs.next()){
            if(id == rs.getInt("id")){
                name = rs.getString("name");
            }
            System.out.println("id는 " + id + ", name은 " + name + ".");
        }

    }
}
