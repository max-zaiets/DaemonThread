import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Runnable daemonRunner = () -> {};

        Thread daemonThread = new Thread(daemonRunner);
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Is a daemon:  \t" + daemonThread.isDaemon());
        System.out.println("Is alive: \t" + daemonThread.isAlive());
        System.out.println("Thread id:  \t \t \t" + daemonThread.getId());
        System.out.println("Thread priority:   \t" + daemonThread.getPriority());
        System.out.println("Thread state:  \t \t" + daemonThread.getState());
        System.out.println("ClassLoader:  \t \t" + daemonThread.getContextClassLoader());
        System.out.println("hashCode: \t \t \t" + daemonThread.hashCode());
        System.out.println("Thread class : \t \t " + daemonThread.getClass());
        System.out.println("Thread group:  \t \t \t" + daemonThread.getThreadGroup());
        System.out.println("StackTrace: \t \t " + Arrays.toString(daemonThread.getStackTrace()));
        System.out.println("UncaughtExceptionHandler: " + daemonThread.getUncaughtExceptionHandler());
        System.out.println("Is interrupted: " + daemonThread.isInterrupted());
    }
}
