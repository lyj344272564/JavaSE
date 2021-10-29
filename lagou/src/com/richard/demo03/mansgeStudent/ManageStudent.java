package com.richard.demo03.mansgeStudent;

import java.util.Iterator;
import java.util.List;

public class ManageStudent {

    private List<Student> studentList;


    public ManageStudent(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent() {

        System.out.println("请输入要增加的学生信息(学号,姓名,年龄)：");
        String strStudent = ScannerStudent.getScanner().next();

        String[] strings = strStudent.split(",");

        int id = Integer.parseInt(strings[0]);
        for (Student student : studentList) {
            if (id == student.getId()) {
                System.out.println("该学生已经存在，增加失败");
                return;
            }
        }

        Student student = new Student(id,strings[1],Integer.parseInt(strings[2]));
        studentList.add(student);

        System.out.println("增加学生信息成功");

    }

    public void deleteStudent() {
        System.out.println("请输入要删除的学生的学号：");
        int id = ScannerStudent.getScanner().nextInt();

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (id == student.getId()) {
                iterator.remove();
                System.out.println("删除成功，被删除的学生信息是：" + student);
                return;
            }
        }
        // 否则删除失败
        System.out.println("该学生不存在，删除失败！");
    }

    public void modifyStudent() {
        System.out.println("请输入要修改的学生学号：");
        int id = ScannerStudent.getScanner().nextInt();

        for (int i=0; i<studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                // 修改成功的处理方式
                System.out.println("请输入修改后的信息（姓名 年龄）：");
                String name = ScannerStudent.getScanner().next();
                int age = ScannerStudent.getScanner().nextInt();
                Student student = new Student(id, name, age);
                studentList.set(i,student);
                System.out.println("修改成功，修改后的学生信息是：" + student);
                return;
            }
        }

        System.out.println("修改失败，该学生不存在！");

    }
    public void queryStudent() {
        // 1.提示用户输入要查找的学生信息并使用变量记录
        System.out.println("请输入要查找的学生学号：");
        int id = ScannerStudent.getScanner().nextInt();

        // 2.使用增强版for循环去查找学生信息并给出提示信息
        for(Student s : studentList) {
            if(id == s.getId()){
                // 查找成功的处理方式
                System.out.println("查找成功，查找到的学生信息是：" + s);
                return;
            }
        }
        // 查找失败的处理方式
        System.out.println("查找失败，该学生不存在！");
    }
    public void printStudent() {
        System.out.println("---------------------------------------------");
        System.out.println("目前所有的学生信息是：");
        for(Student s : studentList){
            System.out.println(s);
        }
        System.out.println("---------------------------------------------");
    }

}
