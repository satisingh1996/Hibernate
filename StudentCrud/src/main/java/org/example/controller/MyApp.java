package org.example.controller;


import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyApp {
    public static void main(String args[])
    {
        Configuration cfg = new Configuration().configure("configuration.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

//        Student student=new Student();

//        student.setId(3);
//        student.setName("xyz");
//        student.setSalary(50000);

//        session.save(student);
//        transaction.commit();

//        session.beginTransaction().commit();
//        System.out.println("Data added to database");

        Student s1=session.get(Student.class,2);
        System.out.println(s1);

        s1.setName("satish");

        session.update(s1);

        transaction.commit();

//        acbd



    }
}
