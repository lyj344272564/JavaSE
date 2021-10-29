package com.richard.demo03.mansgeStudent;

public class ViewStudent {

    private ManageStudent ms;

    public ViewStudent(ManageStudent ms){
        this.ms = ms;
    }

    public void showMenu() {

        while(true){
            System.out.println("\n\n\t       学生信息管理系统");
            System.out.println("-------------------------------------------");
            System.out.print("   [1] 增加学生信息");
            System.out.println("         [2] 删除学生信息");
            System.out.print("   [3] 修改学生信息");
            System.out.println("         [4] 查找学生信息");
            System.out.print("   [5] 显示学生信息");
            System.out.println("         [0] 退出学生系统");
            System.out.println("-------------------------------------------");
            System.out.println("请选择具体的业务编号:");
            int choose = ScannerStudent.getScanner().nextInt();

            switch(choose) {
                case 1: ms.addStudent(); break;
                case 2: ms.deleteStudent(); break;
                case 3: ms.modifyStudent(); break;
                case 4: ms.queryStudent(); break;
                case 5: ms.printStudent(); break;
                case 0: System.out.print("谢谢使用，再见！");
                    return;
                default:System.out.println("输入错误，请重新输入");
            }
        }
    }
}
