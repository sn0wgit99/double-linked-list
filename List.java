public class List<T> {
    T data;
    List<T> next, prev;

    List(T data) {
        this.data = data;
    }
}
