package pl.bakkchos.springangular.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "\"users\"")
@XmlRootElement
public class UserEntity {
    @Id
    private String username;
    private String password;

    public UserEntity() {
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
