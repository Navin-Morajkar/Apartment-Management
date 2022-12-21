/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment.management;

public class ActivitiesTable {


        String bus_no;
        Double MILAGE;
        public ActivitiesTable (String bus_no, Double MILAGE) {
            this.bus_no = bus_no;//
            this.MILAGE = MILAGE;

        }
        public String getBus_no() {
            return bus_no;
        }

        public void setBus_no(String bus_no) {
            this.bus_no = bus_no;
        }
        //
        public Double getMILAGE() {
            return MILAGE;
        }

        public void setMILAGE(Double MILAGE) {
            this.MILAGE = MILAGE;
        }
        ///

}
