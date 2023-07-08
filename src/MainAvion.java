public class MainAvion {
    public static void main(String[] args) {
        Avion boeing737Max=new Avion("Boeing","737 Max",200,2003);
        System.out.println(boeing737Max.getMake());
        System.out.println(boeing737Max.getModel());
        System.out.println(boeing737Max.getNumberOfSeats());
        System.out.println(boeing737Max.getYearOfMake());

    }
}
