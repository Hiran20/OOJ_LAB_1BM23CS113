class MessageThread extends Thread {
    private String message;
    private int interval;

    // Constructor for the thread
    public MessageThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    
    @Override
    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(interval); 
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        Thread thread1 = new MessageThread("BMS College of Engineering", 10000); // 10 seconds
        Thread thread2 = new MessageThread("CSE", 2000); // 2 seconds
 
        
        thread1.start();
        thread2.start();
        System.out.println("Hiran B");
        System.out.println("1BM23CS113");
    }
}
