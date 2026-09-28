package BrawlStars;

//Clase abstracta necesaria si quieres contener metodos abstractos en el
public abstract class User {

    //Variables que heredaran las clases hijas muy necesarias para llevar un control de usuarios
    private final String username;
    private final String password;

    //Constructor con las variables propuestas para la cracion de usuarios
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Metodo para verificar la similitud de los parametros dados con los de los usuarios ya registrados controlando los logins
    public boolean matches(String username, String password) {
        return this.username.equals(username)
                && this.password.equals(password);
    }

    //Funcion abstract que variara segun clase hija
    public abstract void showUserMenu();
}
