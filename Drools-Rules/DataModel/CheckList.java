package cdss.kb.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;

public class CheckList  extends Core{
    // 病人信息
    private PatientInformation patientInformation;
    // 临床路径
    private ArrayList<Process>  processes = new ArrayList<>();

    public CheckList() {
//        patientInformation = new PatientInformation();
//        processes = new ArrayList<Process>();
//        processes.add(new Process());
    }

    public PatientInformation getPatientInformation() {
        return patientInformation;
    }

    public void setPatientInformation(PatientInformation patientInformation) {
        this.patientInformation = patientInformation;
    }

    public ArrayList<Process> getProcesses() {
        return processes;
    }

    public void setProcesses(ArrayList<Process> processes) {
        this.processes = processes;
    }


    public void addProcess(Process process) {
        this.processes.add(process);
    }

    public Process getProcess(String processId) {
        Optional<Process> process  = this.processes.stream().filter(process1 -> processId.equals(process1.getProcessID())).findFirst();
        return process.orElse(null);
    }


    public static CheckList parse(InputStream stream) throws IOException {
        return JSON.parseObject(stream, CheckList.class);
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat);
    }

    public void save(String path) {
        try {
            File file = new File(path);
            File folder = new File(file.getParent());
            if(!folder.exists()){
                folder.mkdirs();
            }
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(this.toString());
            writer.close();
        } catch (Exception e){
        }
    }

    public void load(String path) {
        try {
            File file = new File(path);
            if(!file.exists()){
                return;
            }
            FileInputStream stream = new FileInputStream(file);
            CheckList checkList = JSON.parseObject(stream, CheckList.class);
            if(null != checkList){
                checkList.copyTo(this);
            }
            stream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void copyTo(CheckList target) {
        if(null == target){
            return;
        }

        if(null != patientInformation) {
            if(null == target.patientInformation){
                target.patientInformation = new PatientInformation();
            }
            patientInformation.copyTo(target.patientInformation);
        }

        if(null != processes) {
            if(null == target.processes){
                target.processes = new ArrayList<Process>();
            }
            target.processes = new ArrayList<Process>(processes);
        }
    }


}
