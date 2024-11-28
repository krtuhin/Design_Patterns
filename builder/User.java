package builder;

public class User {

    // final variable
    private final String userId;
    private final String name;
    private final String email;

    // private constructor
    private User(UserBuilder builder) {

        // initialize
        this.userId = builder.userId;
        this.name = builder.name;
        this.email = builder.email;
    }

    // getters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + ", email=" + email + "]";
    }

    // inner builder class
    static class UserBuilder {

        private String userId;
        private String name;
        private String email;

        // constructor
        public UserBuilder() {

        }

        // create a method which will return the builder class object (optional)
        public static UserBuilder builder() {
            return new UserBuilder();
        }

        // setters with return the class type
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        // build method to return the outer class with this class as parameter
        public User build() {
            return new User(this);
        }

    }

}
