package sandbox;

public class EnumDemo {
    public static void main(String[] args) {
        SeverityEnum level = SeverityEnum.DEBUG;
        SeverityClass level1 = SeverityClass.DEBUG;
        // logic:
        switch (level){
            case WARN: break;
            case ERROR: break;
            case DEBUG: break;
        }
        System.out.println(level.valueOf("WARN"));
        System.out.println(SeverityEnum.values());
    }
}

enum SeverityEnum {
    ERROR, WARN, DEBUG
}

final class SeverityClass {
    //============== static world
    public static final SeverityClass ERROR = new SeverityClass(0); // all static is another world
    public static final SeverityClass WARN = new SeverityClass(1);
    public static final SeverityClass DEBUG = new SeverityClass(2);
    //=============== new
    private int ordinal;
    private SeverityClass(int ordinal){ // private constructor to prevent creation of new values
        this.ordinal = ordinal;
    }

    public int getOrdinal() {
        return ordinal;
    }
}