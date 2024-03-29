package DataStructure;

public interface List {
    void add(String item);
    void remove(int id);
    void remove(String item);
    String get(int id);
    void add(int id, String item);
    void clear();
    int size();
    void set(int id, String item);
    //int toArray();
    boolean isEmpty();
    boolean contains(String item);
}
