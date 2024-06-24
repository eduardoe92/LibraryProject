package com.libraryproject.libraryproject.exceptions;

public class MyClass {
    public void myMethod() throws MyException {
        boolean someConditionIsMet = true;
        if (someConditionIsMet) {
            throw new MyException("This is a custom exception message.");
        }
    }
}
