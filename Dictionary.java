/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

import java.util.ArrayList;

/**
 *
 * @author abc
 */
public class Dictionary {

    ArrayList<Word> tu = new ArrayList<>();

    public Dictionary() {
        tu.add(new Word(1, "dog", "c"));
        tu.add(new Word(2, "cat", "m"));
        tu.add(new Word(3, "bird", "ch"));
        tu.add(new Word(4, "hotdog", "xx"));
        tu.add(new Word(5, "go", "g"));
        tu.add(new Word(6, "apple", "t"));
        tu.add(new Word(7, "orange", "a"));
        tu.add(new Word(8, "banana", "chuoi"));
        tu.add(new Word(9, "word", "d"));
        tu.add(new Word(10, "hello", "chao"));
        sapXep();
    }
    public void them(String en,String vn){
        int id=tu.size()+1;
        tu.add(new Word(id, en, vn));
        System.out.println(tu.get(id-1).toString());
        System.out.println(tu.size());
        sapXep();
        
    }
    
    
    

    public void sapXep() {

        for (int i = 0; i < this.tu.size() - 1; i++) {
            for (int j = i + 1; j < this.tu.size(); j++) {
                if (this.tu.get(i).getdu().compareToIgnoreCase(this.tu.get(j).getdu()) > 0) {
                    Word tmpWord = this.tu.get(i);
                    this.tu.set(i, this.tu.get(j));
                    this.tu.set(j, tmpWord);
                }
            }
        }
    }

    public String timKiem(String name) {

        int ketQua = binarySearch(0, tu.size() - 1, name);
        if (ketQua != -1) {
            return tu.get(ketQua).gettat();
        }
        return "";
    }

    int binarySearch(int l, int r, String x) {
        if (r >= l) {
            int mid = l + (r - l) / 2; 

           
            if (tu.get(mid).getdu().compareTo(x) == 0) {
                return mid;
            }

           
            if (tu.get(mid).getdu().compareTo(x) > 0) {
                return binarySearch(l, mid - 1, x);
            }

            
            return binarySearch(mid + 1, r, x);
        }

       
        return -1;
    }
    
    

}
