package org.hisoka.extension.init;

import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Hinsteny
 * @version $ID: SentinelInitial 2018-09-16 14:43 All rights reserved.$
 */
public class SentinelInitialListener implements ApplicationListener<ContextRefreshedEvent> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        if (null == applicationContext.getParent()) {
            initSentinel(applicationContext);
        }
    }

    /**
     * 获取当前应用中配置的所有规则对象
     * @param applicationContext
     */
    private void initSentinel(ApplicationContext applicationContext) {
        Map<String, FlowRule> rulesMap = applicationContext.getBeansOfType(FlowRule.class);
        if (rulesMap.size() > 0) {
            List<FlowRule> rules = new ArrayList<>(rulesMap.size());
            rulesMap.forEach((name, bean) -> {
                if (logger.isInfoEnabled()) {
                    logger.info("just load sentinel rule of {}", name);
                }
                rules.add(bean);
            });
            FlowRuleManager.loadRules(Collections.unmodifiableList(rules));
            if (logger.isInfoEnabled()) {
                logger.info("success loaded {} sentinel rules", rules.size());
            }
        }
    }
}
