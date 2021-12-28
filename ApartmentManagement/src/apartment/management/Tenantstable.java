/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apartment.management;

/**
 *
 * @author RISHAB GHANTI
 */
public class Tenantstable {
    
    
    String fullname,flatno,phoneno;

    public Tenantstable(String fullname, String flatno, String phoneno) {
        this.fullname = fullname;
        this.flatno = flatno;
        this.phoneno = phoneno;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFlatno() {
        return flatno;
    }

    public void setFlatno(String flatno) {
        this.flatno = flatno;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    
}
