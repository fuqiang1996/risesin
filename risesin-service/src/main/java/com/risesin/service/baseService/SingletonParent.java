package com.risesin.service.baseService;

import java.util.HashMap;
import java.util.Map;

/***
 **工具抽象化了单例类实现，以工具形态提供，继承过滤，通过泛型方法实现
 **非典型性单例实现，也可以说和单例有些原理相悖，但如果如果以传统单例实现以实例化单出口为原则那么privte的构造方法将和继承的约定（调用父类默认构造函数进行子类构造）相冲突，那么只能在每个bean中独立实现单例
 **这个妥协方案人为约定即使在protected访问域内也不显现new这个类的各个子类
 **这个方案经过了单例模式的线程安全及高并发优化
 ***/

//如不加这注释会有类型cast告警
@SuppressWarnings("all")
public class SingletonParent {
    private static Map<Class<? extends SingletonParent>, SingletonParent> INSTANCES_MAP = new HashMap<Class<? extends SingletonParent>, SingletonParent>();

    protected SingletonParent() {}

    public synchronized static <E extends SingletonParent> E getInstance(Class<E> instanceClass) throws Exception {
        if (INSTANCES_MAP.containsKey(instanceClass)) {
            return (E) INSTANCES_MAP.get(instanceClass);
        } else {
            E instance = instanceClass.newInstance();
            INSTANCES_MAP.put(instanceClass, instance);
            return instance;
        }
    }
}
