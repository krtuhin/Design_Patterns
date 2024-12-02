package iterator;

public class Main {
    public static void main(String[] args) {

        /*
         * Ways to implement iterator design pattern
         * 
         * 1. Create a management class which will contain the list of object
         * 
         * 2. Create Iterator interface with two methods -> hasNext(), next()
         * 
         * 3. Implementation class of iterator interface, override those two methods
         * 
         * 4. Use the iterator to iterate over the management object (list of objects)
         * 
         */

        // create user management object
        UserManagement userManagement = new UserManagement();

        // add user to user management
        userManagement.addUser(new User("1", "Tuhin"));
        userManagement.addUser(new User("12", "Rahul"));
        userManagement.addUser(new User("3", "Ankit"));
        userManagement.addUser(new User("14", "Nayan"));
        userManagement.addUser(new User("6", "Soumya"));

        // get iterator from user management
        MyIterator iterator = userManagement.getIterator();

        // iterate over the list using iterator's methods
        while (iterator.hasNext()) {

            User user = (User) iterator.next();

            // perform logic on the object

            System.out.println(user.getName());

        }

    }
}