package com.ttk.prototype.demo;

/**
 * @Author TTK
 * @Description 在java中实现原型模式的方法只需要实现Cloneable接口
 * @Version 1.0
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");

        return (Realizetype) super.clone();
    }
}
