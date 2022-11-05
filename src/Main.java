public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(181,58));
        System.out.println(getDurationString(3945L));
    }
    public static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid Value";
        }
        long hour = minutes / 60;
        long remminutes = minutes % 60;

        String hourString = hour + "h ";
        if(hour < 10) hourString = "0" + hourString;
        String minsString = remminutes + "m ";
        if(remminutes < 10) minsString = "0" + minsString;
        String secString = seconds + "s ";
        if(seconds < 10) secString = "0" + secString;
        return (hourString + minsString + secString);
    }
    public static String getDurationString(long seconds) {
        if((seconds < 0)) {
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remseconds = seconds % 60;
        return (getDurationString(minutes, remseconds));
    }
}