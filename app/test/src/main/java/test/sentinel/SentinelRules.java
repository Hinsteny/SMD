package test.sentinel;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hinsteny
 * @version $ID: SentinelRules 2018-09-16 13:26 All rights reserved.$
 */
public class SentinelRules {

    public void loadRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("HelloWorld");
        // set limit qps to 20
        rule.setCount(5);
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }

}
