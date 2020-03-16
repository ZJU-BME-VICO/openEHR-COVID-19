package cdss.kb.core;

public class PatientIdentification {

    private String patientid;
    private String visitid;

    public String getPatientid() {
        return patientid;
    }

    public PatientIdentification(String patientid, String visitid) {
        this.patientid = patientid;
        this.visitid = visitid;
    }

    public PatientIdentification() {
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getVisitid() {
        return visitid;
    }

    public void setVisitid(String visitid) {
        this.visitid = visitid;
    }
}
