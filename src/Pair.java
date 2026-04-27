public class Pair<T extends Comparable<T>,S extends Comparable<S>> implements Comparable<Pair<T,S>> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public boolean equals(Object other){
        if(this == other)
            return true;
        if( !(other instanceof Pair))
            return false;
        Pair<T,S> p = (Pair<T,S>) other;
        return first.equals(p.first) && second.equals(p.second);
    }

    public int hashCode(){
        int val = 17;
        val = val*19 + first.hashCode()*5 + second.hashCode()*7;
        return val;
    }

    public int compareTo(Pair<T,S> other){
        if(this.first.compareTo(other.first) == 0)
            return this.second.compareTo(other.second);
        return this.first.compareTo(other.first);
    }


}
