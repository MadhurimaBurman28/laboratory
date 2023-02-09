package assignment;


public class PriorityThread extends Thread{

    public void run() {
        for (int i =1;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Thread is running! " + Thread.currentThread().getName() + " - Priority - "
            + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
    	PriorityThread t1 = new PriorityThread();
    	PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();


        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(NORM_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t3.setPriority(MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start(); 

	
}
}
