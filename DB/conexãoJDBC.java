public class ConnectionJDBC {

    public static void main(String[] args) {

        String driver = "mysql";
        String dataBaseAddress = "us-cdbr-east-02.cleardb.com";
        String dataBaseName = "heroku_5534e621f769bf1";
        String user = "b87e87ab96bddb";
        String password = "75df2fe5";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString();


        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }

    }
}
