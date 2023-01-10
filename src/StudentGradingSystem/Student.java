package StudentGradingSystem;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;

    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.exam = (mat * 80) / 100;
            this.mat.avgNote += this.mat.exam;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.exam = (fizik * 70) / 100;
            this.fizik.avgNote += this.fizik.exam;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.avgNote = (kimya * 65) / 100;
            this.kimya.avgNote += this.kimya.exam;
        }

    }

    public void addQuizNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.quiz = (mat * 20) / 100;
            this.mat.avgNote += this.mat.quiz;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.quiz = (fizik * 30) / 100;
            this.fizik.avgNote += this.fizik.quiz;

        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.exam = (kimya * 35) / 100;
            this.kimya.avgNote += this.kimya.quiz;
        }
    }

    public void isPass() {
        if (this.mat.avgNote == 0 || this.fizik.avgNote == 0 || this.kimya.avgNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");

            } else {
                System.out.println("Sınıfta Kaldı.");

            }
            this.mat.avgNote=0;
            this.fizik.avgNote=0;
            this.kimya.avgNote=0;
        }

    }

    public void calcAvarage() {

        this.avarage = (this.fizik.avgNote + this.kimya.avgNote + this.mat.avgNote) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.avgNote);
        System.out.println("Fizik Notu : " + this.fizik.avgNote);
        System.out.println("Kimya Notu : " + this.kimya.avgNote);
    }

}
