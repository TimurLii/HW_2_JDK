package HW3;

public class Pair <K , V> {
    private K k;
    private V v;
    public Pair(K k,V v) {
        this.k =k;
        this.v = v;
    }
    public K getFirst(){
        return k;
    }
    public V getSecond(){
        return v;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }

    public static void main(String[] args) {

        Pair pair = new Pair(12, "Ears");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);


        Pair pair1 = new Pair("12", 12);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair1);
    }

}
