package Scratch;

 class Subject {
     private String subId;
     private String name;
     private int maxMarks;
     private int marksObtained;

     //Constructor with all Value
     public Subject(String subId, String name, int maxMarks, int marksObtained) {
         this.subId = subId;
         this.name = name;
         this.maxMarks = maxMarks;
         this.marksObtained = marksObtained;
     }

     //Getter
     public String getSubId() {
         return subId;
     }

     public String getName() {
         return name;
     }

     public int getMaxMarks() {
         return maxMarks;
     }

     public int getMarksObtained() {
         return marksObtained;
     }

     //setter
     public void setMaxMarks(int maxMarks) {
         this.maxMarks = maxMarks;
     }

     public void setMarksObtained(int marksObtained) {
         this.marksObtained = marksObtained;
     }

     //Qualified
     public boolean isQualified() {
         return marksObtained >= (maxMarks * 0.4);
     }

     //toString method
     public String toString() {
         return "Subject Id:" + subId +
                 ",Name:" + name +
                 ",MaxMarks:" + maxMarks +
                 ",MarksObtained" + marksObtained +
                 ",Qualified:" + isQualified() ;
     }
 }

 class student {
     private String rollNo;
     private String name;
     private String department;
     private Subject[] subjects;

     //Constructor
     public student(String rollNo, String name, String department) {
         this.rollNo = rollNo;
         this.name = name;
         this.department = department;
     }
     //getter
     public String getRollNo(){

         return rollNo;
     }public String getName(){
         return name;
     }
     public String getDepartment(){
         return department;
     }
     public Subject[] getSubjects() {
         return subjects;
     }
     //setter
     public void setDepartment(String department) {

         this.department = department;
     }
     //Array method
     public void setSubjects(Subject... subjects){
         this.subjects= subjects;
     }
 }
 public class MainStdclass {
     public static void main(String[] args) {
         Subject S1 = new Subject("s1.1", "Ds", 100, 80);
         Subject S2 = new Subject("s1.2", "pps", 100, 80);
         Subject S3 = new Subject("s1.3", "Os", 100, 80);

         student st = new student("112", "khushi lokhande", "ECE");
         st.setSubjects(S1, S2, S3);
         System.out.println("student name:" + st.getName());
         System.out.println("Roll No:" + st.getRollNo());
         System.out.println("Department:" + st.getDepartment());
         System.out.println("Subjects:");

         for (Subject s : st.getSubjects()) {
             System.out.println(s);
         }
     }

     }