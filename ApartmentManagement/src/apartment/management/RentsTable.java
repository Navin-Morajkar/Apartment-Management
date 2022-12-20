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
    
    
   
    
    String trip_no,bus_no, Source, Destination,TripDate,Driver_emp_id,Conductor_emp_id,scheduled_dept_time,scheduled_arr_time;
// oblist.add(new RentsTable(rs.getString("trip_no"), rs.getString("bus_no"),rs.getString("Source"),rs.getString("Destination"),rs.getString("TripDate"),rs.getString("Driver_emp_id"),rs.getString("Conductor_emp_id"),rs.getString("scheduled_dept_time"), rs.getString("scheduled_arr_time")));

    public RentsTable(String trip_no,  String bus_no, String Source, String Destination, String TripDate, String Driver_emp_id, String Conductor_emp_id, String scheduled_dept_time, String scheduled_arr_time) {
        this.trip_no= trip_no;
        this.bus_no = bus_no;
        this.Source = Source;
        this. Destination =  Destination;
        this.TripDate = TripDate;
        this.Driver_emp_id = Driver_emp_id;
        this.Conductor_emp_id =Conductor_emp_id;
        this.scheduled_dept_time = scheduled_dept_time;
        this.scheduled_arr_time = scheduled_arr_time;
    }


   
    
    
}
