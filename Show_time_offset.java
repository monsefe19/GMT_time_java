public class Show_time_offset {
    public static void main(String[] args) {

        long milisconde = System.currentTimeMillis();
        long hour, minut, second, toutalsecond, toutalmint, toutalhour;
        toutalsecond = milisconde/1000;
        second = toutalsecond%60;
        toutalmint = toutalsecond/(60);
        minut = toutalmint%60;
        toutalhour = toutalmint/(60);
        hour = toutalhour%24;
        System.out.println(hour+"/"+minut+"/"+second);
    }
}
