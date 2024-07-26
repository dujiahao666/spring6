package org.myspringframework.core;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 15:36
 * @description: MySpring框架的应用上下文接口
 */
public interface ApplicationContext {

    /**
     * 根据bean的名称获取相应的bean对象
     * @param beanName myspring配置文件中bean标签的id。
     * @return 对应的单例bean对象。
     */
    Object getBean(String beanName);
}
