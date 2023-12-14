abstract class Vaccine{
    int age;
    String nationality;
    boolean firstDoseTaken;
    boolean secondDoseTaken;

    public Vaccine(int age,String nationality){
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose(){
        if(nationality.equals("Indian") && age >= 18){
            System.out.println("You are eligible to take the first dose.");
            System.out.println("Please pay 250 rs.");
            firstDoseTaken = true;
        } else {
            System.out.println("You are not eligible to take the first dose.");
        }
    }
    public void secondDose() {
        if (firstDoseTaken) {
            System.out.println("You are eligible to take the second dose.");
            secondDoseTaken = true;
        } else {
            System.out.println("You must first complete the first dose.");
        }
    }
    public abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine{
    
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        if(firstDoseTaken && secondDoseTaken){
            System.out.println("You are eligible to take the booster dose.");   
        }else{
            System.out.println("You are not eligible to take the booster dose.");
        }
    }

}


public class Question3 {
    public static void main(String[] args) {
        VaccinationSuccessful vaccinationSuccessful = new VaccinationSuccessful(18, "Indian");
        vaccinationSuccessful.firstDose();
        // vaccinationSuccessful.secondDose();
        vaccinationSuccessful.boosterDose();   
    }
}
