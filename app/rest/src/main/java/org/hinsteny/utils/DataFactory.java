package org.hinsteny.utils;

import java.util.function.Function;

/**
 * @author Hinsteny
 * @version $ID: DataFactory 2018-09-06 20:59 All rights reserved.$
 */
public abstract class DataFactory {

    /**
     * 输入一个转化处理方法和输入参数, 返回生成的数据
     * @param create
     * @param input
     * @param <T>
     * @param <R>
     * @return
     */
    public static final <T, R> R buildData(Function<T, R> create, T input) {
        return create.apply(input);
    }
}
