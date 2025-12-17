// Generic class
class Pawan<T> {
    T value;

    Pawan(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}
class JPT {
    public static void getValue(Pawan<?> j) {
        Object obj = j.getValue(); // Can safely read as Object
        System.out.println(obj);
    }
}
class JJP {
    public static void main(String[] args) {
        Pawan<String> jj = new Pawan<>("Hello World");
        JPT.getValue(jj);
    }
}
