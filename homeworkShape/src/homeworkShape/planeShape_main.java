package homeworkShape;

import java.util.Scanner;

import homeworkShape.*;

public class planeShape_main {
    private static final String VERSION = "0.2";
    private static final String CMDVER = "-v";
    private static final String CMDHELP = "-help";
    private static final String CMDSET = "-set";
    private static final String CMDGET = "-get";
    private static final String CMDEXIT = "-exit";
    private static planeShape shape;
    private static Scanner sc;

    private static void printHelp() {
        System.out.println("planeShape.");
        System.out.println("");
        System.out.println("Usage:");
        System.out.println(CMDHELP);
        System.out.println(CMDSET + " <shapeCategory> <attributes>");
        System.out.println(CMDGET + " area | circumference");
        System.out.println("");
        System.out.println("Options:");
        System.out.println(CMDHELP + "\t\tShow this help screen.");
        System.out.println(CMDVER + "\t\tShow app version.");
        System.out.println(CMDSET + "\t\tSet shape category and attributes.");
        System.out.println(
                "\tcircle <radius> | <x> <y> <radius>\tSet shape as circle using radius only or with central point.");
        System.out
                .println(
                        "\ttriangle <edgelength> | <x> <y>\t\tSet shape as triangle using 3 edgelength or three point.");
        System.out.println("\tsquare <edgelength>\t\t\tSet shape as square using edgelength.");
        System.out.println("\tpentagon <edgelength>\t\t\tSet shape as pentagon using edgelength.");
        System.out.println(CMDEXIT + "\t\tExit.");

        return;
    }

    private static void setShape() {
        String category = sc.next();
        String attributesLine = sc.nextLine();
        String attributes[] = attributesLine.split(" ");
        switch (category) {
            case "circle":
                if (attributes.length == 2) {
                    shape = new planeShape_circle(Double.valueOf(attributes[1]).doubleValue());
                } else if (attributes.length == 4) {
                    shape = new planeShape_circle(Double.valueOf(attributes[1]).doubleValue(),
                            Double.valueOf(attributes[2]).doubleValue(), Double.valueOf(attributes[3]).doubleValue());
                } else {
                    System.err.println("wrong number of circle attributes: " + (attributes.length - 1));
                }
                break;
            case "triangle":
                if (attributes.length == 4) {
                    shape = new planeShape_triangle(Double.valueOf(attributes[1]).doubleValue(),
                            Double.valueOf(attributes[2]).doubleValue(), Double.valueOf(attributes[3]).doubleValue());
                } else if (attributes.length == 7) {
                    shape = new planeShape_triangle(Double.valueOf(attributes[1]).doubleValue(),
                            Double.valueOf(attributes[2]).doubleValue(), Double.valueOf(attributes[3]).doubleValue(),
                            Double.valueOf(attributes[4]).doubleValue(), Double.valueOf(attributes[5]).doubleValue(),
                            Double.valueOf(attributes[6]).doubleValue());
                } else {
                    System.err.println("wrong number of triangle attributes: " + (attributes.length - 1));
                }
                break;
            case "square":
                if (attributes.length == 2) {
                    shape = new planeShape_square(Double.valueOf(attributes[1]).doubleValue());
                } else {
                    System.err.println("wrong number of square attributes: " + (attributes.length - 1));
                }
                break;
            case "pentagon":
                if (attributes.length == 2) {
                    shape = new planeShape_pentagon(Double.valueOf(attributes[1]).doubleValue());
                } else {
                    System.err.println("wrong number of pentagon attributes: " + (attributes.length - 1));
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
            case "area":
                System.out.println("area is : " + shape.getArea());
                break;
            case "circumference":
                System.out.println("circumference is : " + shape.getCircumference());
                break;
            default:
                System.err.println("unknown target.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("planeShape by zyc ver " + VERSION + ", use \"" + CMDHELP + "\" for help.");
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
