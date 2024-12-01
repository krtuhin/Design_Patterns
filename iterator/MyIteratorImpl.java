package iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> list;
    private int length;
    private int position = 0;

    // will take the list
    public MyIteratorImpl(List<User> list) {
        this.list = list;
        this.length = list.size();
    }

    // return next item in the list exist or not
    @Override
    public boolean hasNext() {
        if (position >= length)
            return false;
        else
            return true;
    }

    // return next item from the list
    @Override
    public Object next() {
        User user = list.get(position);
        position += 1;
        return user;
    }

}
