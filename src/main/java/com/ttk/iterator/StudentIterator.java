package com.ttk.iterator;

/**
 * @Author TTK
 * @Description 抽象迭代器角色接口
 * @Version 1.0
 */
public interface StudentIterator {

    //判断是否还有元素
    boolean hasNext();

    //获取下一个元素
    Student next();
}
