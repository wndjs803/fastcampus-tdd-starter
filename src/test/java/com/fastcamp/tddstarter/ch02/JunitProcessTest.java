package com.fastcamp.tddstarter.ch02;

import org.junit.jupiter.api.*;

public class JunitProcessTest {
    public JunitProcessTest(){
        System.out.println("Constructor");
        // test가 실행되기 전
        // beforeEach가 실행되기 전
    }

    @BeforeAll
    public static void beforeAllTest(){
        System.out.println("BeforeAll");
        // 전체 test가 시작될 때 딱 한 번
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("BeforeEach");
        // 각 test method 실행되기 전에 먼저
    }

    @Test
    public void test1ForTest(){
        System.out.println("Test");
    }

    @Test
    public void test2ForTest(){
        System.out.println("Test2");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("AfterEach");
        // 각 test method가 끝이 난 후마다
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("AfterAll");
        // 모든 test가 끝났을 때
    }
}
