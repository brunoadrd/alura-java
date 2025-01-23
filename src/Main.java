public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        boolean planIncluded = true;
        double rateFilm = 8.1;
        String filmText = """
                          Filme de aventura
                          Lançamento: %d
                          """.formatted(releaseYear);

        System.out.println(filmText);

        int rateStar = (int) (rateFilm/2);
    }
}