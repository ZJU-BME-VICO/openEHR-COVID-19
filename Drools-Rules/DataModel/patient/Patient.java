package cdss.kb.core.patient;

import cdss.kb.core.Core;
import cdss.kb.core.Problem;
import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
public class Patient extends Core {
    private PatientInfo patientInfo; // 病人信息
    private VisitInfo visitInfo;     // 住院信息
    private ArrayList<FinancialInfo> financialList; // 费用信息
    private ArrayList<FamilyHistory> familyHistoryList; //家族历史
    private ArrayList<PastHistory> pastHistoryList;// 既往史记录
    private ArrayList<Diagnosis> diagnosisList; // 诊断记录
    private ArrayList<ImgExamResult> imgExamResultList; // 检查结果
    private ArrayList<LabTestResult> labTestResultList; // 检验结果
    private ArrayList<PhysicalSign> physicalSignList; //体征记录
    private ArrayList<Surgery> surgeryList; // 手术记录
    private ArrayList<Transfer> transferList; // 转科记录
    private ArrayList<Order> orderList; // 医嘱记录
    private ArrayList<MedicalRecord> medicalRecordList; // 病历记录
    private ArrayList<NurseScheduling> nurseSchedulingList; //护士排班记录
    private EpidemicHistory epidemicHistory;//流行病学史
    private ArrayList<Symptom> symptomList;//症状记录


    public Patient(){
        patientInfo = new PatientInfo();
        visitInfo = new VisitInfo();
        familyHistoryList = new ArrayList<>();
        pastHistoryList = new ArrayList<>();
        physicalSignList = new ArrayList<>();
        labTestResultList = new ArrayList<>();
        imgExamResultList = new ArrayList<>();
        surgeryList = new ArrayList<>();
        transferList = new ArrayList<>();
        orderList = new ArrayList<>();
        medicalRecordList = new ArrayList<>();
        nurseSchedulingList = new ArrayList<>();
        epidemicHistory = new EpidemicHistory();
        symptomList = new ArrayList<>();
    }

    public static Patient parse(InputStream stream) throws IOException {
        return JSON.parseObject(stream, Patient.class);
    }
    //Symptom
    public Symptom getSymptom(String text){
        Optional<Symptom> symptom  = this.symptomList.stream().filter(symptom1 -> text.equals(symptom1.getText())).
                sorted( Comparator.comparing(Symptom::getReportDateTime).reversed()).findFirst();
        return symptom.orElse(new Symptom());
    }
    // PhysicalSign
    //函数的重载
    public PhysicalSign getPhysicalSign(String itemName){
        Optional<PhysicalSign> physicalSign  = this.physicalSignList.stream().filter(physicalSign1 -> itemName.equals(physicalSign1.getItemName())).
            sorted( Comparator.comparing(PhysicalSign::getMeasureDateTime).reversed()).findFirst();
        return physicalSign.orElse(new PhysicalSign());
    }
    public PhysicalSign getPhysicalSign(ArrayList<PhysicalSign> physicalSignList1){
        Optional<PhysicalSign> physicalSign  = physicalSignList1.stream().
            sorted( Comparator.comparing(PhysicalSign::getMeasureDateTime).reversed()).findFirst();
        return physicalSign.orElse(new PhysicalSign());
    }
    public ArrayList<PhysicalSign> getPhysicalSignList(String itemName){
        List<PhysicalSign> physicalSignList2  = this.physicalSignList.stream().filter(physicalSign1 -> itemName.equals(physicalSign1.getItemName())).
            sorted( Comparator.comparing(PhysicalSign::getMeasureDateTime).reversed()).collect(Collectors.toList());
        return (ArrayList<PhysicalSign>) physicalSignList2;
    }
    //LabTestResult
    public LabTestResult getLabTestResult(String itemName){
        Optional<LabTestResult> labTestResult  = this.labTestResultList.stream().filter(labTestResult1 -> itemName.equals(labTestResult1.getItemName())).
            sorted( Comparator.comparing(LabTestResult::getRequestDateTime).reversed()).findFirst();
        return labTestResult.orElse(new LabTestResult());
    }
    public LabTestResult getLabTestResult(ArrayList<LabTestResult> labTestResultList1){
        Optional<LabTestResult> labTestResult  = labTestResultList1.stream().
            sorted( Comparator.comparing(LabTestResult::getRequestDateTime).reversed()).findFirst();
        return labTestResult.orElse(new LabTestResult());
    }
    public ArrayList<LabTestResult> getLabTestResultList(String itemName){
        List<LabTestResult> labTestResultList2  = this.labTestResultList.stream().filter(labTestResult1 -> itemName.equals(labTestResult1.getItemName())).
            sorted( Comparator.comparing(LabTestResult::getRequestDateTime).reversed()).collect(Collectors.toList());
        return (ArrayList<LabTestResult>) labTestResultList2;
    }
    //Order
    public Order getOrder(String text){
        Optional<Order> order = this.orderList.stream().filter(order1 -> text.equals(order1.getText())).
            sorted(Comparator.comparing(Order::getStartDateTime).reversed()).findFirst();
        return order.orElse(new Order());
    }
    public Order getOrder(String text,String Flag){
        Optional<Order> order;
        if(Flag.equals("YZ")){
        order = this.orderList.stream().filter(order1 -> text.equals(order1.getText())).findFirst();
//        System.out.println("1YZ!!!!!");
        }else{
        order = this.orderList.stream().filter(order1 -> text.equals(order1.getText())).
            sorted(Comparator.comparing(Order::getStartDateTime).reversed()).findFirst();
    }
        return order.orElse(new Order());
    }
    public Order getOrder(ArrayList<Order> orderList1){
        Optional<Order> order = orderList1.stream().
            sorted(Comparator.comparing(Order::getStartDateTime).reversed()).findFirst();
        return  order.orElse(new Order());
    }
    public Order getOrder(ArrayList<Order> orderList1,String Flag){
        Optional<Order> order;
        if(Flag.equals("YZ")){
            order = orderList1.stream().findFirst();
//            System.out.println("2YZ!!!!!");
        }else{
            order = orderList1.stream().
                sorted(Comparator.comparing(Order::getStartDateTime).reversed()).findFirst();
        }
        return  order.orElse(new Order());
    }
    public ArrayList<Order> getOrderList(String text){
        List<Order> orderList2  = this.orderList.stream().filter(order1 -> text.equals(order1.getText())).
            sorted( Comparator.comparing(Order::getStartDateTime).reversed()).collect(Collectors.toList());
        return (ArrayList<Order>) orderList2;
    }
    public ArrayList<Order> getOrderList(String text,String Flag){
        List<Order> orderList2;
        if(Flag.equals("YZ")){
            orderList2  = this.orderList.stream().filter(order1 -> text.equals(order1.getText())).
                collect(Collectors.toList());
//            System.out.println("3YZ!!!!!");
        }else {
            orderList2 = this.orderList.stream().filter(order1 -> text.equals(order1.getText())).
                sorted(Comparator.comparing(Order::getStartDateTime).reversed()).collect(Collectors.toList());
        }
        return (ArrayList<Order>) orderList2;
    }
}
