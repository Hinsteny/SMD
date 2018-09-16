package org.hisoka.extension.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Hinsteny
 * @version $ID: SentinelInitial 2018-09-16 15:07 All rights reserved.$
 */
public class SentinelInitial implements ApplicationContextAware {

    /**
     * Set the ApplicationContext that this object runs in. Normally this call will be used to initialize the object. <p>Invoked after population of normal bean properties but before an init callback
     * such as {@link InitializingBean#afterPropertiesSet()} or a custom init-method. Invoked after {@link ResourceLoaderAware#setResourceLoader}, {@link
     * ApplicationEventPublisherAware#setApplicationEventPublisher} and {@link MessageSourceAware}, if applicable.
     *
     * @param applicationContext the ApplicationContext object to be used by this object
     * @throws ApplicationContextException in case of context initialization errors
     * @throws BeansException if thrown by application context methods
     * @see BeanInitializationException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}
