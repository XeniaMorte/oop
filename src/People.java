public class People {
     private String name;
   private int yearOfBirth;
    private String town;
   private String job;
    public People(String name,String town, int yearOfBirth,String job) throws Exception {
        this.town=town;
        this.name=name;
        this.yearOfBirth=yearOfBirth <=0 ? 0: yearOfBirth;
        this.job=job;
        if (this.town==null){
            throw new Exception("«Информация не указана» ");
        }
        if (this.name==null){
            throw new Exception("«Информация не указана» ");
        }
        if (this.job==null){
            throw new Exception("«Информация не указана» ");
        }

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
