/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

/**
 *
 * @author abc
 */
public class Word {
    private String tu_du,tu_tat;
      public Word() {
    }

    public Word( String en, String vn) {
       
        this.tu_du = en;
        this.tu_tat = vn;
    }

    public String getdu() {
        return tu_du;
    }

    public void setEn(String en) {
        this.tu_du = en;
    }

    public String gettat() {
        return tu_tat;
    }

    public void setVn(String vn) {
        this.tu_tat = vn;
    }

    @Override
    public String toString() {
        return "Word{" + "tu_du=" + tu_du + ", tu_tat=" + tu_tat + ", id=" + id + '}';
    }

  

    
    
    
}
