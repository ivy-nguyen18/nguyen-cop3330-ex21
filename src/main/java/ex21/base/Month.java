package ex21.base;

public class Month {
    private int month;

    public Month(int numMonth){
        this.month = numMonth;
    }

    public StringBuilder getMonth(){

        StringBuilder output = new StringBuilder();
        output.append("The name of the month is ");

        switch (month){
            case 1:
                output.append("January");
                break;
            case 2:
                output.append("February");
                break;
            case 3:
                output.append("March");
                break;
            case 4:
                output.append("April");
                break;
            case 5:
                output.append("May");
                break;
            case 6:
                output.append("June");
                break;
            case 7:
                output.append("July");
                break;
            case 8:
                output.append("August");
                break;
            case 9:
                output.append("September");
                break;
            case 10:
                output.append("October");
                break;
            case 11:
                output.append("November");
                break;
            case 12:
                output.append("December");
                break;
            default:
                StringBuilder invalid = new StringBuilder();
                invalid.append("Error: Month does not exist");
                return invalid;
        }
        return output;
    }
}
