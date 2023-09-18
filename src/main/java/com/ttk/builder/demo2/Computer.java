package com.ttk.builder.demo2;


/**
 * @Author TTK
 * @Description 创建一个静态内部类Builder，用于链式的构建Computer，调用的时候可读性更高
 * @Version 1.0
 */
public class Computer {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    //私有构造方法
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }
        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        //使用构建者创建Phone对象
        public Computer build() {
            return new Computer(this);
        }
    }
}
