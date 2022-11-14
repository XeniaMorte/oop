public class People {
    String name;
    int yearOfBirth;
    String town;
    String job;
    public People(String name,String town, int yearOfBirth,String job){
        this.town=town;
        this.name=name;
        this.yearOfBirth=yearOfBirth;
        this.job=job;

    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void znakomstvo(){
        System.out.println( "Привет! Меня зовут"+ name+" "+" Я из города" +" "+town+" "+"Я родился в"+" "+yearOfBirth+" году. Будем знакомы!");

    }
    public void znakomstvoAndJob(){
        System.out.println( "Привет! Меня зовут"+ name+" "+" Я из города" +" "+town+" "+"Я родился в"+" "+yearOfBirth+" году."+" "+"я работаю"+" "+ job+" "+" Будем знакомы!");

    }
}
