package lesson5.generics.ex1;

public class GenericBox <T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public GenericBox(T object) {
        this.object = object;
    }
}
