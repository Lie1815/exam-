package Mountains;


public class Mount {
    private String Name;
    private String country;
    private int height;

    public Mount(String name, String country, int height){
        this.Name = name;
        this.country = country;
        this.height = height;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}