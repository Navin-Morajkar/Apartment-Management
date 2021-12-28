/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment.management;

/**
 *
 * @author RISHAB GHANTI
 */
public class ActivitiesTable {

String date,activityname,time;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ActivitiesTable(String date, String activityname, String time) {
        this.date = date;
        this.activityname = activityname;
        this.time = time;
    }

    
}
