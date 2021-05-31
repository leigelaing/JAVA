package Demo03;

import java.util.Date;

/*
 用户的javaBean，（用户的实体类）

 */
public class User {
 private int id;
 private String username;
 private Date birthday;

    public User() {
    }

    public User(int id, String username, Date birthday) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
