public class Main {
    public static void main(String[] args) throws DateException {
        Date today = new Date(1,1,2022);
        Date tomorrow = new Date(2,1,2000);

        System.out.println(today.getDayOfWeek());
    }
}