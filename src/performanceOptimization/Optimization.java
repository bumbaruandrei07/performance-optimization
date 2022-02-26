package performanceOptimization;

public class Optimization {
    public static void main(String[] args) {
        LazyNumberDetails lnd;
        lnd = new LazyNumberDetails(23); // (1) **none (lazy eval.)** -> no user action
        lnd.updateNumber(10); // (2)  **none (lazy eval.)**    -> no user action
        lnd.updateNumber(17); // (3)  **none (lazy eval.)**    -> no user action
        lnd.isPrime();// (4)  !!intensiveComputation!! -> prime algorithm for 17
        System.out.println(lnd.isPrime());
        lnd.isPrime();        // (5)  **cached**               -> saved result from prime alg
        System.out.println(lnd.isPrime());
        lnd.isPerfect();        // (6)  **cached**               -> saved result from prime alg
        System.out.println(lnd.isPerfect());
        lnd.isPerfect();      // (7)  !!intensiveComputation!! -> perfect algorithm for 17
        System.out.println(lnd.isPerfect());
        lnd.updateNumber(21); // (8) **none (lazy eval.)** -> no user action
        lnd.isPrime();        // (9)  !!intensiveComputation!! -> prime algorithm for 21
        System.out.println("Este 21 numar prim? " + lnd.isPrime());
        lnd.isPerfect();      // (10) !!intensiveComputation!! -> perfect algorithm for 21
        System.out.println(lnd.isPerfect());
        lnd.isMagic();        // (11) !!intensiveComputation!! -> magic algorithm for 21
        System.out.println(lnd.isMagic());
        lnd.isMagic();        // (12)  **cached**               -> saved result from magic alg
        System.out.println(lnd.isMagic());
        lnd.isPrime();        // (13)  **cached**               -> saved result from prime alg
        System.out.println(lnd.isPrime());
        lnd.updateNumber(28); // (14)  **none (lazy eval.)**    -> no user action
        lnd.isPerfect();      // (15)  !!intensiveComputation!! -> perfect algorithm for 28
        System.out.println(lnd.isPerfect());
        lnd.isPrime();        // (16)  !!intensiveComputation!! -> prime algorithm for 28
        System.out.println(lnd.isPrime());
        lnd.isPerfect();      // (17)  **cached**               -> saved result from perfect alg
        System.out.println("Este 28 numar perfect? " + lnd.isPerfect());
        lnd.isMagic();        // (18) !!intensiveComputation!! -> magic algorithm for 28
        System.out.println(lnd.isMagic());
        lnd.isPrime();        // (19) **cached**               -> saved result from prime alg
        System.out.println(lnd.isPrime());
        lnd.updateNumber(12); // (20) **none (lazy eval.)**    -> no user action
        lnd.isMagic();        // (21) !!intensiveComputation!! -> magic algorithm for 12
        System.out.println(lnd.isMagic());
        lnd.isMagic();        // (22) **cached**               -> saved result from magic alg
        System.out.println(lnd.isMagic());
        lnd.isPrime();        // (23) !!intensiveComputation!! -> prime algorithm for 12
        System.out.println(lnd.isPrime());
        lnd.isPrime();        // (24) **cached**               -> saved result from prime alg
        System.out.println(lnd.isPrime());
        lnd.isPerfect();      // (25) !!intensiveComputation!! -> perfect algorithm for 12
        System.out.println(lnd.isPerfect());
        lnd.isPerfect();      // (26) **cached**               -> saved result from perfect alg
        System.out.println(lnd.isPerfect());
        lnd.isPerfect();      // (27) **cached**               -> saved result from perfect alg
        System.out.println(lnd.isPerfect());

    }
}
