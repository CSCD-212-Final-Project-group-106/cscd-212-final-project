public class Airport {

    private String name;

    public Airport(final String name){
        if(name.length() != 3)
            throw new IllegalArgumentException("Name is not 3 letters");

        this.name = name;
    }

}//end of class
