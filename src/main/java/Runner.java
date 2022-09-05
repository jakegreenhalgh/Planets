public class Runner {
    public static void main(String[] args) {
    Planet planet = new Planet("Mars", 3389.5);
    System.out.println(String.format("%s has a surface area of %skm squared", planet.getName(), planet.getSize()));
    planet.explode();
    }
}
