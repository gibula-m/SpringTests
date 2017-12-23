package pl.bakkchos.walli.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "\"user\"")
@XmlRootElement
public class UserEntity {
    @Id
    private String username;
    private String password;
    private String email;

    public UserEntity() {
    }

    public UserEntity(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UserEntity(UserEntity user) {
        this.password = user.password;
        this.username = user.username;
    }

    public UserEntity(String password, String username) {
        this.password = password;
        this.username = username;
    }


    @Override
    public String toString(){
        return String.format(
                "Customer[username='%s', password='%s']",
                username,password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
