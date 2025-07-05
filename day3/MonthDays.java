public class MonthDays {
    public static void main(String[] args) {
        String month = "May";

        switch (month) {
            case "january":
            case "march":
            case "may":
            case "May":
            case "july":
            case "august":
            case "August":
            case "AUGUST":
            case "october":
            case "december":
            System.out.println("This month has 31 days");
                break;
            case "february":
                System.out.println("28 or 29 Days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 Days");
                break;
        
            default:
            System.out.println("It is not a month");
                break;
        }
    }
}
