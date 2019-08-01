package com.company.task1;

@FunctionalInterface
public interface OriginalTask<T> {
    T calculate(Integer a, Integer b, Integer c);
}