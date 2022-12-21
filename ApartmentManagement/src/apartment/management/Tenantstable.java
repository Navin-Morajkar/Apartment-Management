/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apartment.management;

/**
 *
 */
public class Tenantstable {

    String bus_no,revenue,tickets_sold;
    public Tenantstable(String bus_no, String revenue, String tickets_sold) {
        this.bus_no = bus_no;//
        this.revenue = revenue;
        this.tickets_sold =tickets_sold;
    }
    public String getBus_no() {
        return bus_no;
    }

    public void setBus_no(String bus_no) {
        this.bus_no = bus_no;
    }
    //
    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }
    ///
    public String getTickets_sold() {
        return tickets_sold;
    }

    public void setTickets_sold(String tickets_sold){
        this.tickets_sold = tickets_sold;
    }

}
