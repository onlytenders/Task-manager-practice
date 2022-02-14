public class User {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
    }
}
