package equalsarrays;

public class MyClass {
    int a;

    public MyClass(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass)) return false;

        MyClass myClass = (MyClass) o;

        if (a != myClass.a) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return a;
    }
}
