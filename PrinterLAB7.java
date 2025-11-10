class Printer {
    synchronized void printDocument(String user, String documentName) {
        System.out.println(user + " started printing: " + documentName);
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(user + " finished printing: " + documentName);
    }
}

class User implements Runnable {
    private String userName;
    private Printer printer;

    public User(String userName, Printer printer) {
        this.userName = userName;
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printDocument(userName, "Document_from_" + userName + ".pdf");
    }
}
public class PrinterLAB7 {
    public static void main(String[] args) {
        System.out.println("=== Office Print Queue Simulation ===");
        Printer sharedPrinter = new Printer();
        Thread user1 = new Thread(new User("Alice", sharedPrinter));
        Thread user2 = new Thread(new User("Bob", sharedPrinter));
        Thread user3 = new Thread(new User("Charlie", sharedPrinter));
        user1.start();
        user2.start();
        user3.start();
    }
}