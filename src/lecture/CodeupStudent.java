package lecture;

public class CodeupStudent extends Student {
    public CodeupStudent(String[] information, boolean graduated){
        this.firstName = information[0];
        this.lasName = information[1];
        this.cohort = information[2];
        this.computer = information[3];
        this.graduated = graduated;

    }

    @Override
    public void greeting() {
        System.out.println("Hello, "+ cohort);
    }

    @Override
    public void study() {
        System.out.println("Full-Stack Java Curriculum");
    }

    @Override
    public Boolean giveBusinessCards() {
        return graduated;
    }
}
