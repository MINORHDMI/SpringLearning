package com.tutorialspoint3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
        public static void main(String[] args) {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("Bean3.xml");
            TextEditor te = (TextEditor) context.getBean("textEditor");
            te.getName();

            te.spellCheck();



        }
}
