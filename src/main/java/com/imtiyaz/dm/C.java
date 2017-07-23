package com.imtiyaz.dm;

/**
 * Created by imtiyaz on 7/21/17.
 */
public class C implements A, B{

    @Override
    public void m1() {
        A.super.m1();
    }

    public static void main(String[] args) {
        new C().m1();
    }
}
