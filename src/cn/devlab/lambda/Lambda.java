package cn.devlab.lambda;

import java.util.Arrays;

/**
 * Created by zhong on 2017/2/23.
 */
public class Lambda {

    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4).forEach((Integer e) -> {
            System.out.println(e);
            System.out.println(e);
        });
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
