package collectionExmple;

public class PrintQueue  implements Comparable<PrintQueue> {
    int order;
    String value;

    public PrintQueue(int order, String value) {
        this.order = order;
        this.value = value;
    }

    public int compareTo(PrintQueue e){
        return this.order > e.order ? 1 : this.order < e.order ? -1 : 0;
    }

    @Override
    public String toString() {
        return "PrintQueue{" +
                "order=" + order +
                ", value='" + value + '\'' +
                '}';
    }
}
