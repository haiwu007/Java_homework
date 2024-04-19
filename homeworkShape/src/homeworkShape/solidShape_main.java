package homeworkShape;

import java.util.Scanner;

public class solidShape_main {
    private static final String VERSION = "0.1";
    private static final String CMDVER = "-v";
    private static final String CMDHELP = "-help";
    private static final String CMDSET = "-set";
    private static final String CMDGET = "-get";
    private static final String CMDEXIT = "-exit";
    private static solidShapeInterface shape;
    private static Scanner sc;

    private static void printHelp() {
        System.out.println("solidShape.");
        System.out.println("");
        System.out.println("Usage:");
        System.out.println(CMDHELP);
        System.out.println(CMDSET + " <shapeCategory> <attributes>");
        System.out.println(CMDGET + " volume | surfaceArea");
        System.out.println("");
        System.out.println("Options:");
        System.out.println(CMDHELP + "\t\tShow this help screen.");
        System.out.println(CMDVER + "\t\tShow app version.");
        System.out.println(CMDSET + "\t\tSet shape category and attributes.");
        System.out.println(
                "\tcylinder <height> <radius>\tSet shape as cylinder using height and radius.");
        System.out
                .println(
                        "\tcone <height> <radius>\t\tSet shape as cone using height and radius.");
        System.out.println("\tsphere <radius>\t\t\tSet shape as sphere using radius.");
        System.out.println(CMDGET + " volume | surfaceArea\tGet volume or surfaceArea of the shape set before.Must be used after -set!!!!!!");
        System.out.println(CMDEXIT + "\t\tExit.");

        return;
    }

    private static void setShape() {
        String category = sc.next();
        String attributesLine = sc.nextLine();
        String attributes[] = attributesLine.split(" ");
        switch (category) {
            case "cylinder":
                if (attributes.length == 3) {
                    shape = new solidShape_cylinder(Double.valueOf(attributes[1]).doubleValue(), Double.valueOf(attributes[2]).doubleValue());
                } else {
                    System.err.println("wrong number of cylinder attributes: " + (attributes.length - 1));
                }
                break;
            case "cone":
                if (attributes.length == 3) {
                    shape = new solidShape_cone(Double.valueOf(attributes[1]).doubleValue(),
                            Double.valueOf(attributes[2]).doubleValue());
                } else {
                    System.err.println("wrong number of cone attributes: " + (attributes.length - 1));
                }
                break;
            case "sphere":
                if (attributes.length == 2) {
                    shape = new solidShape_sphere(Double.valueOf(attributes[1]).doubleValue());
                } else {
                    System.err.println("wrong number of sphere attributes: " + (attributes.length - 1));
                }
                break;
            default:
                System.err.println("undefined shape.");
                break;
        }
        return;
    }

    private static void getRes() {
        String data = sc.next();
        switch (data) {
            case "volume":
                System.out.println("area is : " + shape.getVolume());
                break;
            case "surfaceArea":
                System.out.println("circumference is : " + shape.getSurfaceArea());
                break;
            default:
                System.err.println("unknown target.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("solidShape by zyc ver " + VERSION + ", use \"" + CMDHELP + "\" for help.");
        sc = new Scanner(System.in);
        while (true) {
            String cmd = sc.next();
            switch (cmd) {
                case CMDHELP:
                    printHelp();
                    break;
                case CMDSET:
                    setShape();
                    break;
                case CMDGET:
                    getRes();
                    break;
                case CMDEXIT:
                    System.out.println("app exit.");
                    return;
                default:
                    System.out.println("unknown command.");
                    break;
            }
        }

    }
}
