package Chapter6YoutubeTutorial;

public class MultipleClasses {
    private String girlName;

    public MultipleClasses(String name) {
        girlName = name;
    }

    public void setName(String name)
    {
        girlName = name;
    }

    public String getGirlName() {
        return girlName;
    }

    public void saying() {
        System.out.printf("Your first gf was %s\n", getGirlName());
    }
    public void saying2() {
        System.out.printf("Your second gf was %s\n", getGirlName());
    }
}

//having public within a public is called instance variable.