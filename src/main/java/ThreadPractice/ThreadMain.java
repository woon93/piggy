package ThreadPractice;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("测试打印线程组");
        Thread t1 = new Thread(threadGroup, () -> {
            try {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println(System.currentTimeMillis() + " 测试线程-1  Exit");
                        break;
                    }
                    System.out.println(System.currentTimeMillis() + " 测试线程-1  Start");
                    Thread.sleep(3000);
                    System.out.println(System.currentTimeMillis() + " 测试线程-1  End");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "测试线程-1");

        Thread t2 = new Thread(threadGroup, () -> {
            try {
//                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println(System.currentTimeMillis() + " 测试线程-2  Exit");
//                        break;
                    }
                    System.out.println(System.currentTimeMillis() + " 测试线程-2  Start");
                    Thread.sleep(3000);
                    System.out.println(System.currentTimeMillis() + " 测试线程-2  End");
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "测试线程-2");

        log("线程1开始");
        t1.start();
        log("线程1结束");

        log("线程2开始");
        t2.run();
        log("线程2结束");


        log("活跃线程数：" + threadGroup.activeCount());
        threadGroup.list();

    }

    public static void log(String msg) {
        System.out.println(System.currentTimeMillis() + ">>>" + msg);
    }

    public static void log() {
        log("");
    }
}
