/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_Sach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Program {

    ArrayList<Sach> ds = new ArrayList<Sach>();
    ArrayList<Sach> dsBanDau = new ArrayList<Sach>();

    @Override
    public String toString() {
        String text = "";
        for (Sach s : ds) {
            text += s.toString();
            text += "\n";
        }
        return text;
    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        Sach s = new Sach();

        System.out.println("nhap ten sach :");
        s.tensach = sc.nextLine();

        System.out.println("nhap tac gia :");
        s.tacgia = sc.nextLine();

        System.out.println("nhap the loai :");
        s.theloai = sc.nextLine();

        System.out.println("nhap so luong :");
        s.soluong = sc.nextInt();

        System.out.println("nhap gia tien :");
        s.gia = sc.nextDouble();

        ds.add(s);

        Sach sa = new Sach(s.tensach, s.tacgia, s.gia, s.soluong, s.theloai);
        dsBanDau.add(sa);
    }

    public void sell() {
        System.out.println("Nhap Sach Can Ban :");
        Scanner sc = new Scanner(System.in);
        String tenSach = sc.nextLine();
        int viTri = 0;
        for (int i = 0; i < ds.size(); i++) {

            if (tenSach.equals(ds.get(i).tensach)) {
                viTri = i;

            }
        }
        if (ds.get(viTri).soluong < 1) {
            System.out.println("Sach nay da ban het");
        } else {
            ds.get(viTri).soluong = ds.get(viTri).soluong - 1;
            System.out.println("Sach :" + ds.get(viTri).tensach + "\nSo luong sach con lai :" + ds.get(viTri).soluong);
        }
        ds.set(viTri, ds.get(viTri));
    }
//    Viết hàm hiển thị ra tổng thu nhập bán sách. (Sach[] sachHienTai, Sach[] SachDaBan

    public void totalIncome() {
        System.out.println("Tong Thu Nhap Ban Dau :");
        double tongtien = 0;
        for (int i = 0; i < dsBanDau.size(); i++) {
            tongtien = tongtien + dsBanDau.get(i).gia * dsBanDau.get(i).soluong;

        }
        System.out.println("Tong Tien :" + tongtien);

        System.out.println("Tong Thu Nhap Con Lai :");
        double tongtien2 = 0;
        for (int i = 0; i < ds.size(); i++) {
            tongtien2 = tongtien2 + ds.get(i).gia * ds.get(i).soluong;
        }
        System.out.println(tongtien2);

        System.out.println("Tong Thu Nhap Ban Ra :");
        double tongtien3 = tongtien - tongtien2;
        System.out.println(tongtien3);

    }

    public void sort() {
        for (int i = 0; i < ds.size(); i++) {
            for (int j = i + 1; j < ds.size(); j++) {
                if (ds.get(i).tensach.compareTo(ds.get(j).tensach) > 0) {
                    String temp = ds.get(i).tensach;
                    ds.get(i).tensach = ds.get(j).tensach;
                    ds.get(j).tensach = temp;
                }

            }
        }
        System.out.println("Danh Sach Sach :");
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i).tensach + ", ");

        }
    }

    public void showtacgia() {
//        for (int i = 0; i < ds.size(); i++) {
//            for (int j = i + 1; j < ds.size(); j++) {
//                if (ds.get(i).soluong < ds.get(j).soluong) {
//                    /*
//                    temp = ds[j];
//                    ds[j] = ds[i];
//                    ds[i] = temp;
//                    */
//                    Sach temp = ds.get(j);
//                    ds.set(j, ds.get(i));
//                    ds.set(i, temp);
//                }
//
//            }
//            
//        }
        int a = 0;
        int vitriSLNhieuNhat = 0;
        for (int i = 0; i < ds.size(); i++) {
            if (a < ds.get(i).soluong) {
                a = ds.get(i).soluong;
                vitriSLNhieuNhat = i;
            }

        }
        System.out.println("Tac Gia :" + ds.get(vitriSLNhieuNhat).tacgia + " Voi So Luong Sach :" + ds.get(vitriSLNhieuNhat).soluong);

//        for(int i = 0; i<ds.size(); i++){
//            if (a==ds.get(i).soluong){
//                System.out.println("Tac Gia :"+ ds.get(i).tacgia + " Voi So Luong Sach :" + ds.get(i).soluong);
//            }
//        }
    }

    public void showSachBanHet() {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).soluong == 0) {
                System.out.println(ds.get(i).tensach);
            }

        }
    }

    public void insertSachBanHet() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).soluong == 0) {
                int nhapsoluong = sc.nextInt();
                ds.get(i).soluong = nhapsoluong;
            }

        }
    }

    public void showTheLoai() {
        System.out.println("Nhap The Loai :");
        Scanner sc = new Scanner(System.in);
        String nhapTheLoai = sc.nextLine();
        for (int i = 0; i < ds.size(); i++) {
            if (nhapTheLoai.equals(ds.get(i).theloai)) {
                System.out.println(ds.get(i).tensach);
            }
        }
    }

    public void run() {
        while (true) {

            System.out.println("1. Nhập Số Lượng Sách :");
            System.out.println("2. Bán Sách :");
            System.out.println("3. Tổng Thu Nhập :");
            System.out.println("4. Hiển Thị Sách Theo Thứ Tự A-Z :");
            System.out.println("5. Tác Giả Có Nhiều Sách Đang Bán :");
            System.out.println("6. Sách Đã Hết :");
            System.out.println("7. Nhập Số Lượng Cho Sách Đã Hết :");
            System.out.println("8. Hiển Thị Sách Theo Thể Loại :");
            System.out.println("NHẬP THAO TÁC :");
            Scanner sc = new Scanner(System.in);
            try {
                int nhap = sc.nextInt();

                switch (nhap) {
                    case 1:
                        insert();
                        break;
                    case 2:
                        sell();
                        break;
                    case 3:
                        totalIncome();
                        break;
                    case 4:
                        sort();
                        break;
                    case 5:
                        showtacgia();
                        break;
                    case 6:
                        showSachBanHet();
                        break;
                    case 7:
                        insertSachBanHet();
                        break;
                    case 8:
                        showTheLoai();
                        break;
                    case 0:
                        System.out.println(toString());
                    default:
                        System.out.println("Nhập Lại Thao Tác ");
                        break;

                }

            } catch (Exception e) {
            }
        }
    }
}
