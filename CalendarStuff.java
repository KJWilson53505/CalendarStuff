public class CalendarStuff {

    public static boolean isLeap ( int year ){
        if ( year % 4 == 0 ) {
            if ( year % 100 == 0 && year % 400 != 0 ){
                return true;
            } else if ( year % 100 == 00 && year % 400 != 0 ) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    } else {
        return false;
    }


    public static boolean isValid( int month, int day, int year ){
        if (month > 0 && month <= 12 && day > 0 && day <= 31 && year >=0 ){
            if ( ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) && day <= 31) {
                return true;
            } else if ( ( month == 4 || month == 6 || month == 9 || month == 11 ) && day <= 30) {
                return true;
            } else if ( month == 2 && ! isLeap(year) && day <= 28 ) {
                return true;
            } else if ( month == 2 && isLeap(year) && day <= 29 ) {

            }
        }
    }

    public static int dayInMonth(int month, int year) {
        switch (month) {
            case 9:
            case 4:
            case 6:
            case 11: return 30;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: return 31;
            case 2: (isLeap ( year ) ) ? return 29 : return 28;
            default: throw new IllegalArgumentExcpetion();
        }
    }
}
