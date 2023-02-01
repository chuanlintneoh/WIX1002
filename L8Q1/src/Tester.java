public class Tester {
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4,50);

        System.out.println("--Number a--");
        a.displayArray();
        a.displayEven();
        a.displayPrime();
        a.displayMax();
        a.displayMin();
        a.displayAverage();
        a.displaySquareNum();
        System.out.println();

        System.out.println("--Number b--");
        b.displayArray();
        b.displayEven();
        b.displayPrime();
        b.displayMax();
        b.displayMin();
        b.displayAverage();
        b.displaySquareNum();
        System.out.println();

        System.out.println("--Number c--");
        c.displayArray();
        c.displayEven();
        c.displayPrime();
        c.displayMax();
        c.displayMin();
        c.displayAverage();
        c.displaySquareNum();
        System.out.println();
    }
}

