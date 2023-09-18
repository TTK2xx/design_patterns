package com.ttk.bridge;

/**
 * @Author TTK
 * @Description Mac操作系统(扩展抽象化角色)
 * @Version 1.0
 */
public class Mac extends OpratingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
