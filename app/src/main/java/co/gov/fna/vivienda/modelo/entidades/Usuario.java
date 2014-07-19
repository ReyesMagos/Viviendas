package co.gov.fna.vivienda.modelo.entidades;

import com.parse.ParseUser;

/**
 * Created by usuario on 19/07/14.
 */
public class Usuario {

    private ParseUser user;
    private String email;
    private String mobile;

    public Usuario(ParseUser user, String mobile, String email) {
        this.user = user;
        this.mobile = mobile;
        this.email = email;
    }

    public ParseUser getUser() {
        return user;
    }

    public void setUser(ParseUser user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
