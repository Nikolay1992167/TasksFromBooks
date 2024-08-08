package books_java_leetcode.immutable.immutableClassTemplateBuilder;

import java.util.Date;

public class User {
    private final String nickname;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date created;

    public User(UserBuilder builder) {
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
        this.created = builder.created;
    }

    public static UserBuilder getBuilder(String nickname, String password){
        return new User.UserBuilder(nickname, password);
    }

    public static final class UserBuilder {
        private final String nickname;
        private final String password;
        private String firstname;
        private String lastname;
        private String email;
        private final Date created;


        public UserBuilder(String nickname, String password) {
            this.nickname = nickname;
            this.password = password;
            this.created = new Date();
        }

        public UserBuilder firstName(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public UserBuilder lastName(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
