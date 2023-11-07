/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;

public class BookList {

    ArrayList<Book> t = new ArrayList<Book>();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        String code = sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter qua: ");
        int qua = sc.nextInt();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        t.add(new Book(code, title, qua, price));
    }

    public void display() {
        for (Book book : t) {
            System.out.println(book.toString());
        }
    }

    public int search(String code) {
        int pos = -1;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCode().compareTo(code) == 0) {
                pos = i;
            }
        }

        return pos;
    }

    public void update(String code, double price) {
        int pos = this.search(code);
        if (pos == -1) {
            return;
        }

        t.get(pos).setPrice(price);
    }

    public boolean isEmpty() {
        return t.isEmpty();
    }

    public int max() {
        int pos = 0;
        double max = this.t.get(0).getPrice();

        for (int i = 1; i < t.size(); i++) {
            Book book = t.get(i);
            if (book.getPrice() > max) {
                max = book.getPrice();
                pos = i;
            }
        }

        return pos;
    }

    public void sortByCode() {
        for (int i = 0; i < t.size(); i++) {
            for (int j = i + 1; j < t.size(); j++) {
                Book a = t.get(i), b = t.get(j);
                if (a.getCode().compareTo(b.getCode()) > 0) {
                    Collections.swap(t, i, j);
                }
            }
        }
    }

    public void remove(String code) {
        int pos = this.search(code);
        if (pos == -1) {
            return;
        }

        t.remove(pos);
    }

    public void loadFile(String fname) {
        t.clear();
        try {
            Scanner sc = new Scanner(new File(fname));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(" ", -3);
                String code = data[0].trim();
                String title = data[1].trim();
                int qua = Integer.valueOf(data[2].trim());
                double price = Double.valueOf(data[3].trim());
                t.add(new Book(code, title, qua, price));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
