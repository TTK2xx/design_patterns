package com.ttk.bridge;

/**
 * @Author TTK
 * @Description rmvb视频文件（具体的实现化角色）
 * @Version 1.0
 */
public class RmvbFile implements VideoFile {

    public void decode(String fileName) {
        System.out.println("rmvb视频文件 ：" + fileName);
    }
}
