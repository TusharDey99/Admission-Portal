package mahi;

import java.io.*;

public class ShowInfo {
//    void writeFacInfo(String fac){
//        try{
//            BufferedWriter bw = new BufferedWriter(new FileWriter
//                    ("C:\\Users\\Mahi\\OneDrive\\Desktop\\Test\\Result\\showFacInput.txt"));
//            bw.write("Faculty selected : " + fac);
////            bw.write("\nDepartment Selected : " + dept);
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    void writeDeptInfo(int dept){
//        try{
//            BufferedWriter bw = new BufferedWriter(new FileWriter
//                    ("C:\\Users\\Mahi\\OneDrive\\Desktop\\Test\\Result\\showDeptInput.txt"));
//            bw.write("Department Selected : " + dept + "\n");
//            bw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    void margeInfo(){
//
//    }
//
//    public static void main(String[] args) {
//        FileInputStream f1 = new FileInputStream("path here");
//        FileInputStream f2 = new FileInputStream("path here");
//        FileOutputStream fout = new FileOutputStream("output.txt");
//        SequenceInputStream combine = new SequenceInputStream(f1, f2);
//
//        int j;
//        while ((j=combine.read()) != 1){
//            fout.write(j);
//        }
//        combine.close();
//        f1.close();
//        f2.close();
//        fout.close();
//    }
//    LET'S MARGE THIS TWO METHOD AND MAKE SINGLE

    public void writeUniversitytInfo(String UniversityName,String unit, int sub){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter
                    ("C:\\Games\\Test\\Result\\universityInput.txt"));
            bw.write("University Selected : " + UniversityName +"\n");
            bw.write("Unit Selected : " + unit + "\n");
            bw.write("Subject Selected(in number) : " + sub + "\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeStudentInfo(String name,String birth, String scl, String clg, String div, int ssc, int hsc,
                                 double sscGpa, double hscGpa , String examDt, String examTm){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter
                    ("C:\\Games\\Test\\Result\\StudentInput.txt"));
            bw.write("Your name: " + name +"\n");
            bw.write("Your date of birth: " + birth + "\n");
            bw.write("Your school name:" + scl + "\n");
            bw.write("Your college name:" + clg + "\n");
            bw.write("Your division: " + div + "\n");
            bw.write("Your SSC passing year: " + ssc + "\n");
            bw.write("Your HSC passing year: " + hsc + "\n");
            bw.write("Your SSC GPA :" + sscGpa + "\n");
            bw.write("Your HSC GPA :" + hscGpa + "\n");
//            bw.write("Subject Selected(in number) : " + rn + "\n");
            bw.write("Your exam date: " + examDt + "\n");
            bw.write("Your exam time: " + examTm + "\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
