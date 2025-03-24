package lesson4.nested;

import lesson4.inner.Gym;

public class NestedClassMain {
    public static void main(String[] args) {
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();

        Gym gym = new Gym("kanban", "Functional");
        Gym.Equipment bar = gym.new Equipment("Bar", 3000);
        nestedClass.tryOuterClass();
        OuterClass.NestedClass.staticNestedMethod();
    }
}
