public class Student extends Persoon {

    private int studentnummer;
    private String studie;

    public Student(int bsn, String voornaam, String achternaam, Datum geboortedatum, char geslacht, int studentnummer, String studie){
        super(bsn, voornaam, achternaam, geboortedatum, geslacht);
        this.studentnummer = studentnummer;
        this.studie = studie;
    }

    public Student(int studentnummer, String studie){
        super();
        this.studentnummer = studentnummer;
        this.studie = studie;
    }

    public Student(){
        super();
        studentnummer = 000000;
        studie = "none";
    }

    public void setStudentnummer(int studentnummer){ this.studentnummer = studentnummer; }

    public void setStudie(String studie){ this.studie = studie; }

    public int getStudentnummer(){ return studentnummer;}

    public String getStudie(){return studie;}

    @Override
    public String toString() {
        return "Student";
    }
}

