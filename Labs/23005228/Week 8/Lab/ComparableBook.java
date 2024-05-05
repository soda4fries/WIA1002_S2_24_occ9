/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabB;

/**
 *Q3
 * @author xinph
 */
public class ComparableBook implements Comparable<ComparableBook> {
    private int id;
    private String title;

    public ComparableBook(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public int compareTo(ComparableBook other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title;
    }
}
