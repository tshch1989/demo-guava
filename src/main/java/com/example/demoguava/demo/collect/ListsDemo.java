package com.example.demoguava.demo.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = Lists.newArrayList();

        ArrayList<String> list1 = Lists.newArrayListWithCapacity(10);

        CopyOnWriteArrayList<Object> list2 = Lists.newCopyOnWriteArrayList();

        LinkedList<Object> list3 = Lists.newLinkedList();

        ImmutableList<Character> aaaa = Lists.charactersOf("aaaa");

        //sublist方式实现,修改分区内的值会影响到原集合,或者说修改分区的值实际是修改的原集合的值,分区可以理解为原集合的一个视图
        ArrayList<Integer> list4 = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<List<Integer>> partition = Lists.partition(list4, 2);
        List<Integer> list5 = partition.get(0);
        list5.set(0,100);
        System.out.println(list4);

        ArrayList<Integer> list6 = Lists.newArrayList(1, 2, 3, 4, 5);
        List<Integer> list7 = Lists.reverse(list6);
        System.out.println(list7);

        //返回值时应用函数
        ArrayList<Integer> list8 = Lists.newArrayList(1, 2, 3);
        List<Integer> list9 = Lists.transform(list8, (k) -> k * 2);
        System.out.println(list9);

        //计算笛卡尔积
        ImmutableList<String> list10 = ImmutableList.of("1", "2");
        ImmutableList<String> list11 = ImmutableList.of("A", "B", "C");
        List<List<String>> list12 = Lists.cartesianProduct(ImmutableList.of(list10, list11));
        for (List<String> objects : list12) {
            System.out.println(objects);
        }

    }
}
