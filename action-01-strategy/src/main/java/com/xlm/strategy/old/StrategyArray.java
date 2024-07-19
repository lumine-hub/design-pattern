package com.xlm.strategy.old;

import java.util.Comparator;

/**
 * @author xlm
 * 2024/7/19 下午3:49
 */
public class StrategyArray {
    public static void main(String[] args) {
        Integer[] data = new Integer[]{7, 2, 3, 5, 6, 4, 8, 9, 1};
        // 实现升序

        //1.Comparator策略接口
        // 2.new Comparator<Integer>()实现策略方法的对象
        // 3.@Override
        //            public int compare(Integer o1, Integer o2) {
        //                return 0;
        //            }指定具体的策略实现
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };


    }
}
