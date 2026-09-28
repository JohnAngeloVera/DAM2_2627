package BrawlStars;

public abstract class User {
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean matches(String username, String password) {
        return this.username.equals(username)
                && this.password.equals(password);
    }

    public abstract void showUserMenu();
}
