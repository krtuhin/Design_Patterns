package builder;

public class Main {
    public static void main(String[] args) {

        /*
         * Ways to create builder pattern
         * 
         * 1. Create private constructor
         * 
         * 2. Create only getters
         * 
         * 3. Create inner class
         * 
         * 4. Create public constructor
         * 
         * 5. Create only setters with a return type of the inner class
         * 
         * 6. Create build method with return type of outer class and pass the inner
         * class as parameter
         * 
         * 7. Create a builder method which will return the builder class object
         * (optional)
         * 
         */

        // without builder method
        User user1 = new User.UserBuilder()
                .setUserId("id123")
                .setName("user1")
                .setEmail("user1@gmail.com")
                .build();

        System.out.println(user1);

        // with builder method
        User user2 = User.UserBuilder.builder()
                .setUserId("id2")
                .setName("user2")
                .setEmail("user2@gmail.com")
                .build();

        System.out.println(user2);
    }

}
