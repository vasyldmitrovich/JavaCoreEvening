package softserve.edu04.task3;

public enum Countries {
    Europe("Great Britain", "Poland", "Spain", "France"),
    Asia("China","India","Japan","Korea"),
    Africa("Nigeria","Ethiopia","Egypt","Tanzania"),
    NorthAmerica("USA","Mexico","Canada","Dominican Republic");

    private final String a,b,c,d;
    private static Countries value;
    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    Countries(String a, String b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }

    public static Countries getContinent(String country){
        for(Countries c: values()){
            if(c.getA().equalsIgnoreCase(country)||c.getB().equalsIgnoreCase(country)||c.getC().equalsIgnoreCase(country)||c.getD().equalsIgnoreCase(country)){
                value=c;
                break;
            }

        }
        return value;
    }
}
