package com.example.baitap1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue
    private long maSv;

    @Column(name = "hoTen")
    private String hoTen;

    @Column(name = "Email")
    private String Email;

    @Column(name = "lopHoc")
    private String lopHoc;

    public Student() {
    }

    public long getMaSv() {
        return maSv;
    }

    public void setMaSv(long maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }
}
