package test.sentinel;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author Hinsteny
 * @version $ID: ProtectResource 2018-09-16 13:24 All rights reserved.$
 */
public class ProtectResource {

    public void doWork() {
        Entry entry = null;
        try {
            entry = SphU.entry("HelloWorld");
            // BIZ logic being protected
            System.out.println("hello world");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (BlockException e) {
            // handle block logic
        } finally {
            // make sure that the exit() logic is called
            if (entry != null) {
                entry.exit();
            }
        }
    }

}
