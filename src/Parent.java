abstract public class Parent<T> {

    abstract public void debug(T t);

    public void save(T t) {
        debug(t);
        System.out.println("save");
    }

    abstract public T getObj(String key);

    public T get(String key) {

        return getObj(key);
    }

    abstract public T updateObj(String key, long id);

    public void update(String key, long id) {
        T t1 = updateObj(key, id);
        save(t1);
    }

    public void delete(String key) {
        System.out.println("delete");
    }
}
