package com.richard.demo03.mansgeStudent;

import java.util.LinkedList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        List<Student> studentList = new LinkedList<>();

        ManageStudent manageStudent = new ManageStudent(studentList);

        ViewStudent viewStudent = new ViewStudent(manageStudent);

        viewStudent.showMenu();

        ScannerStudent.closeScanner();

    }

}
