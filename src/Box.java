public class Box<T extends Number>   {
    T value;


    public Box(T value) {
        this.value = value;
    }

    public void set(T value){
        this.value = value;
    }

    public T getValue() { return value;}


    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }

    public boolean absEquals(Box<?> other){
        return Math.abs(this.value.doubleValue()) == Math.abs(other.value.doubleValue());

    }


}
