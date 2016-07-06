package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File f1 = new File("/Users/Eva/Documents/fwd/car-f-92.crs");
        File f2 = new File("/Users/Eva/Documents/fwd/car-s-91.crs");
        File f3 = new File("/Users/Eva/Documents/fwd/ear-f-83.crs");
        File f4 = new File("/Users/Eva/Documents/fwd/hec-s-92.crs");
        File f5 = new File("/Users/Eva/Documents/fwd/kfu-s-93.crs");
        File f6 = new File("/Users/Eva/Documents/fwd/lse-f-91.crs");
        File f7 = new File("/Users/Eva/Documents/fwd/pur-s-93.crs");
        File f8 = new File("/Users/Eva/Documents/fwd/rye-s-93.crs");
        File f9 = new File("/Users/Eva/Documents/fwd/sta-f-83.crs");
        File f10 = new File("/Users/Eva/Documents/fwd/tre-s-92.crs");
        File f11 = new File("/Users/Eva/Documents/fwd/uta-s-92.crs");
        File f12 = new File("/Users/Eva/Documents/fwd/ute-s-92.crs");
        File f13 = new File("/Users/Eva/Documents/fwd/yor-f-83.crs");


        String p1 = new String("/Users/Eva/Documents/fwd/car-f-92.stu");
        String p2 = new String("/Users/Eva/Documents/fwd/car-s-91.stu");
        String p3 = new String("/Users/Eva/Documents/fwd/ear-f-83.stu");
        String p4 = new String("/Users/Eva/Documents/fwd/hec-s-92.stu");
        String p5 = new String("/Users/Eva/Documents/fwd/kfu-s-93.stu");
        String p6 = new String("/Users/Eva/Documents/fwd/lse-f-91.stu");
        String p7 = new String("/Users/Eva/Documents/fwd/pur-s-93.stu");
        String p8 = new String("/Users/Eva/Documents/fwd/rye-s-93.stu");
        String p9 = new String("/Users/Eva/Documents/fwd/sta-f-83.stu");
        String p10 = new String("/Users/Eva/Documents/fwd/tre-s-92.stu");
        String p11 = new String("/Users/Eva/Documents/fwd/uta-s-92.stu");
        String p12 = new String("/Users/Eva/Documents/fwd/ute-s-92.stu");
        String p13 = new String("/Users/Eva/Documents/fwd/yor-f-83.stu");


        File[] files = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13};
        String[] paths = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13};

        for (int i = 0, j = 0; i < 13; i++, j++ ){

            String string;
            int lines;

            TablePreview tablePreview = new TablePreview(files[i], paths[j]);
            lines = tablePreview.getCoursesNumber();
            int[] courses;


            string = tablePreview.getStudentInformationAsString(paths[j]);


            courses = tablePreview.getStudentsNumberInCourses(string, lines);

            tablePreview.printTable(courses);

        }
    }
}
