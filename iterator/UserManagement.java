package iterator;

import java.util.ArrayList;

public class UserManagement {

    private ArrayList<User> users = new ArrayList<>();

    // method to add item in the list
    public void addUser(User user) {
        this.users.add(user);
    }

    // method to get single item from the list
    public User getUser(int index) {
        return this.users.get(index);
    }

    // method to traverse the list
    public MyIterator getIterator() {
        return new MyIteratorImpl(users);
    }

}
