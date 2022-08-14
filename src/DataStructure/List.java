package DataStructure;

public interface List {
    void add(String item);
    void remove(int id);
    void remove(String name);
    String get(int id);
    void add(int id, String item);
    int clear();
    int size();
    boolean isEmpty();
    boolean contains();

    boolean contains(String anotherItem);
}
