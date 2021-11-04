package com.richard.demo04.manageStudent;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * 编程实现学生信息管理系统的测试
 */
public class MainTest {

	public static void main(String[] args) {

		DaoStudent daoStudent = null;

		try {
			// 1.创建一个集合用于存储所有学生信息
			List<Student> studentList = new LinkedList<>();

			// 4.当系统启动时读取文件中所有学生信息到List集合中
			daoStudent = new DaoStudent(studentList);
			studentList = daoStudent.readStudentList();

			// 2.通过集合进行学生信息的增删改查操作
			ManageStudent manageStudent = new ManageStudent(studentList);
			ViewStudent viewStudent = new ViewStudent(manageStudent);
			viewStudent.showMenu();
		} catch (IOException | ClassNotFoundException | AgeException | IdException e) {
			e.printStackTrace();
		} finally {
			// 3.关闭扫描器
			ScannerStudent.closeScanner();

			// 5.当系统退出时将List集合中所有学生信息写入到文件中
			try {
				assert daoStudent != null;
				daoStudent.writeStudentList();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
