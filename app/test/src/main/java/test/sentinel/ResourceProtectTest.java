package test.sentinel;

/**
 * @author Hinsteny
 * @version $ID: ResourceProtectTest 2018-09-16 13:28 All rights reserved.$
 */
public class ResourceProtectTest {

    public static void main(String[] args) throws InterruptedException {
        new SentinelRules().loadRules();
        final ProtectResource resource = new ProtectResource();
        for (int i = 0; ;) {
            new Thread(()-> resource.doWork()).start();
            i++;
            if (i % 10 == 0) {
//                Thread.sleep(3000);
            }
        }
    }

}
