package com.young.tank;

import java.net.MalformedURLException;

/**
 * TODO
 *
 * @author wangshuai
 * @version V1.0
 * @since 2017-09-29 15:37
 */
public class TankMain{
    static CreateWindow window;

    public static void main(String[] args) throws MalformedURLException {
//		new AudioPlay().play("audio\\bu.wav");
//		new AudioPlay().loop("audio\\move.wav");
        window = new CreateWindow(Data.WINDOW_TITLE, Data.WINDOW_WIDTH, Data.WINDOW_HEIGHT, Data.WINDOW_FPS, Data.WINDOW_ICOIMG);
    }
}
