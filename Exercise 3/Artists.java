class Artists {
    private String name; 
    private int age; 
    private String band; 

    //constructor
    public Artists(String name, int age, String band){
        this.name = name; 
        this.age = age; 
        this.band = band; 
    }

    public String getName(){
        return name; 
    }

    public int getAge(){
        return age; 
    }

    public String getBand(){
        return band; 
    }
}
