package com.javaswing.studentmanagement;

import java.util.List;
import java.util.ArrayList;

public class ListStudent {

    private List<Student> lstStudent;

    public ListStudent() {
        this.lstStudent = new ArrayList<Student>();
    }

    public List<Student> getLstStudent() {
        return lstStudent;
    }

    public void setLstStudent(List<Student> lstStudent) {
        this.lstStudent = lstStudent;
    }

    public String addStudent(Student st) {
        lstStudent.add(st);
        return "Thành công!!!";
    }

    public int removeStudent(String idDel) {
        int index = 0;
        for (Student _student : lstStudent) {

            if (_student.getId().equals(idDel)) {
                break;
            }
            index++;
        }
        if (index != lstStudent.size()) {
            lstStudent.remove(index);
            return index;
        }
        return index;
    }

    public boolean updateInfoStudent(Student st) {
        int index = 0;
        boolean notify =false;
        for (Student _student : lstStudent) {

            if (_student.equals(st)) {
                lstStudent.set(index, st);
                break;
            }
            index++;
        }
        if (index < lstStudent.size()) {
            notify = true;
        } else {
            notify = false;
        }
        return notify;
    }

    public String inThongTinList() {
        String str = "";
        for (Student student : lstStudent) {
            str += student.inThongTin() + "\n";
        }
        return str;
    }

    public boolean checkingIDStudent(Student st) {
        boolean flag = true;
        for (Student student : lstStudent) {
            if (student.getId().equals(st.getId())) {
                flag = false;
            }
        }
        return flag;
    }
    public Student findStudentByID(String idFind){
        for (Student student : lstStudent) {
            if(student.getId().equals(idFind))
                return student;
        }
        return null;
    }
}
