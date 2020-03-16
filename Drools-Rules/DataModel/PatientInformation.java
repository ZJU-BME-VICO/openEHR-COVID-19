package cdss.kb.core;

public class PatientInformation  extends Core{

    private String patientID;

    private String patientName;

    private String admissionID;

    public PatientInformation() {
        patientID = "";
        patientName = "";
        admissionID = "";
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAdmissionID() {
        return admissionID;
    }

    public void setAdmissionID(String admissionID) {
        this.admissionID = admissionID;
    }

    public void copyTo(PatientInformation target){
        if(null == target){
            return;
        }
        target.patientID = patientID;
        target.patientName = patientName;
        target.admissionID = admissionID;
    }
}
