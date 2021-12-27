/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment.management;

/**
 *
 * @author hp
 */
public final class GlobalData {

    private static String userName;

    private GlobalData() {
    }

    public static void setUsername(String userName) {

        GlobalData.userName = userName;
    }

    public static String getUsername() {

        return userName;
    }

}
