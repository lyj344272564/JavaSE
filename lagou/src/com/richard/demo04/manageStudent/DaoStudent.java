package com.richard.demo04.manageStudent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * 编程实现学生信息管理系统中数据访问层的功能
 */
public class DaoStudent {
	/**
	 * 定义一个集合类型的引用，通过构造方法将整个集合传入
	 */
	private List<Student> studentList;

	/**
	 * 通过构造方法实现成员变量的初始化
	 * @param studentList
	 */
	public DaoStudent(List<Student> studentList){
		this.studentList = studentList;
	}

	/**
	 * 自定义成员方法实现将整个集合写入到文件中
	 * @throws IOException
	 */
	public void writeStudentList() throws IOException {
		//1.创建ObjectOutputStream类型的对象与./student.txt文件关联
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/student.txt"));

		//2.将整个集合的学生信息都写入到文件中
		oos.writeObject(studentList);
		// System.out.println("写入数据到文件成功！");

		//3.关闭流对象并释放有关的资源
		oos.close();
	}

	/**
	 * 自定义方法实现读取文件中的所有学生信息
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public List<Student> readStudentList() throws IOException, ClassNotFoundException{
		// 当./student.txt文件存在时，才需要读取里面的内容
		if(new File("d:/student.txt").exists()){
			// 1.创建ObjectInputStream类型的对象与./student.txt文件关联
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("d:/student.txt"));

			// 2.将文件中的所有学生信息都读取出来
			studentList = (List<Student>) ois.readObject();
			for(Student s : studentList){
				System.out.println(s);
			}
			//System.out.println("读取文件中的数据成功！");

			// 3.关闭流对象并释放有关的资源
			ois.close();
		}
		return studentList;
	}
}
