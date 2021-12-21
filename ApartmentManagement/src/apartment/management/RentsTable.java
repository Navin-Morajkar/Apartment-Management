/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment.management;

import java.sql.Date;

/**
 *
 * @author Saish
 */
public class RentsTable {
    
    
   
    
    String duedate,status,dueamount;

    public RentsTable(String duedate, String status, String dueamount) {
        this.duedate = duedate;
        this.status = status;
        this.dueamount = dueamount;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDueamount() {
        return dueamount;
    }

    public void setDueamount(String dueamount) {
        this.dueamount = dueamount;
    }

   
    
    
}
