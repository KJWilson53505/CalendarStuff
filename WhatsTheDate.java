public class WhatsTheDate {
    
//This assignment was graded 9 out of 10

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
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static int dayInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: return 31;
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            case 2: return isLeap( year )? 29 : 28;
            default: return(0);
        }
    }
    //     return Integer.toString( month ) + " " + Integer.toString( day ) + " " + Integer.toString( year );
    // } else {
    //     throw new IllegalArgumentException();

    public static void main ( String [] args ) {
        //int n = Integer.parseInt( args[i] );
        int month = Integer.parseInt( args [0] );
        int day = Integer.parseInt( args [1] );
        int year = Integer.parseInt( args [2] );
        int daysAdded = Integer.parseInt( args [3] );
        if (daysAdded >= 0){
        if ( isValid ( month, day, year ) ) {
            for ( int i = daysAdded; i > 0; i -= 1 ) {
                day += 1;
                if ( day > dayInMonth( month, year ) ) {
                    month += 1;
                    day = 1;
                }
                if ( month > 12 ) {
                    year += 1;
                    month = 1;
                }
            }
    } else {
        throw new IllegalArgumentException();
    }
        System.out.println(month + " " + day + " " + year);
    } else {
        throw new IllegalArgumentException();
    }
    }
}
