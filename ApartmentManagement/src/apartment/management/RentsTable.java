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


    String trip_no, bus_no, Source, Destination, TripDate, Driver_emp_id, Conductor_emp_id, scheduled_dept_time, scheduled_arr_time;
// oblist.add(new RentsTable(rs.getString("trip_no"), rs.getString("bus_no"),rs.getString("Source"),rs.getString("Destination"),rs.getString("TripDate"),rs.getString("Driver_emp_id"),rs.getString("Conductor_emp_id"),rs.getString("scheduled_dept_time"), rs.getString("scheduled_arr_time")));

    public RentsTable(String trip_no, String bus_no, String Source, String Destination, String TripDate, String Driver_emp_id, String Conductor_emp_id, String scheduled_dept_time, String scheduled_arr_time) {
        this.trip_no = trip_no;//
        this.bus_no = bus_no;//
        this.Source = Source;//
        this.Destination = Destination;//
        this.TripDate = TripDate;//
        this.Driver_emp_id = Driver_emp_id;
        this.Conductor_emp_id = Conductor_emp_id;
        this.scheduled_dept_time = scheduled_dept_time;
        this.scheduled_arr_time = scheduled_arr_time;
    }
    public String getTrip_no() {
        return trip_no;
    }

    public void setTrip_no(String trip_no) {
        this.trip_no = trip_no;
    }


//
    public String getBus_no() {
        return bus_no;
    }

    public void setBus_no(String bus_no) {
        this.bus_no = bus_no;
    }
    //
    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        this.Source = Source;
    }
///
public String getDestination() {
    return Destination;
}

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }
    //

    public String getTripDate() {
        return TripDate;
    }

    public void setTripDate(String TripDate) {
        this.TripDate = TripDate;
    }
    //
    public String getDriver_emp_id() {
        return Driver_emp_id;
    }

    public void setDriver_emp_id(String Driver_emp_id) {
        this.Driver_emp_id = Driver_emp_id;
    }

    //

    public String getConductor_emp_id() {
        return Conductor_emp_id;
    }

    public void setConductor_emp_id(String Conductor_emp_id) {
        this.Conductor_emp_id = Conductor_emp_id;
    }
    //

    public String getScheduled_dept_time() {
        return scheduled_dept_time;
    }

    public void setScheduled_dept_time(String scheduled_dept_time){
        this.scheduled_dept_time = scheduled_dept_time;
    }
    //
    public String getScheduled_arr_time() {
        return scheduled_arr_time;
    }

    public void setScheduled_arr_time(String scheduled_arr_time){
        this.scheduled_arr_time = scheduled_arr_time;
    }
}
