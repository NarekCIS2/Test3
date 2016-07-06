package com.company;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Eva on 2/7/2016.
 */
public class TablePreview {
    private File f;
    private String p;
    String new_string;
    BufferedReader new_bufferedReader;
    int new_lines;
    int index = 0;

    // Initialize file
    public TablePreview(File new_f, String new_p) {
        f = new_f;
        p = new_p;
    }


    public int getCoursesNumber() throws IOException {
        new_bufferedReader = new BufferedReader(new FileReader(f));
        while (new_bufferedReader.readLine() != null) {
            new_lines++;
        }
        new_bufferedReader.close();
        return new_lines;
    }

    public String getStudentInformationAsString(String p) throws IOException {
        byte[] a = Files.readAllBytes(Paths.get(p));
        new_string = new String(a, Charset.defaultCharset());
        return new_string;
    }

    public int[] getStudentsNumberInCourses(String new_string, int new_lines) {
        String[] arr = new_string.split("\\W+");
        int[] courses = new int[new_lines + 1];
        for (String s : arr) {
            index = Integer.parseInt(s);
            courses[index] += 1;
        }
        return courses;
    }

    public void printTable(int[] new_courses) {
        for(int i = 1; i < new_lines; i++) {
            System.out.printf("%04d", i);
            System.out.println("\t" + new_courses[i]);
        }
        System.out.println("");
    }
}
