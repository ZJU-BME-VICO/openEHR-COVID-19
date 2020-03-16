package cdss.kb.core;

import java.util.ArrayList;

public class StaffInformation  extends Core{

    // id
    private String staffID;
    // name
    private String staffName;
    //
    private ArrayList<String> staffRoles;
    // staffDepartment
    private String staffDepartment;
    // staffTelephone
    private String staffTelephone;

    public StaffInformation(){
        staffID = "";
        staffName = "";
        staffRoles = new ArrayList<String>();
        staffRoles.add("");
        staffDepartment = "";
        staffTelephone = "";
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public ArrayList<String> getStaffRoles() {
        return staffRoles;
    }

    public void setStaffRoles(ArrayList<String> staffRoles) {
        this.staffRoles = staffRoles;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getStaffTelephone() {
        return staffTelephone;
    }

    public void setStaffTelephone(String staffTelephone) {
        this.staffTelephone = staffTelephone;
    }
}

