class Books {
    public static void main(String[] args) {
        // Book 1
        String B1Name = "In the dream house";
        String B1Author = "Carmen Maria Machado";
        int B1Pages = 251;

        // Book 2
        String B2Name = "Circe";
        String B2Author = "Madeline Miller";
        int B2Pages = 393;

        // Book 3
        String B3Name = "Piranesi";
        String B3Author = "Susanna Clarke";
        int B3Pages = 272;

        // Book 1 Information printing
        System.out.println("Book Name: " + B1Name);
        System.out.println("Book Author: " + B1Author);
        System.out.println("Book pages: " + B1Pages);

        // Book 2 Information printing
        System.out.println("Book Name: " + B2Name);
        System.out.println("Book Author: " + B2Author);
        System.out.println("Book pages: " + B2Pages);

        // Book 3 Information printing
        System.out.println("Book Name: " + B3Name);
        System.out.println("Book Author: " + B3Author);
        System.out.println("Book pages: " + B3Pages);

        // Total rating for all the books
        int totalPages = B1Pages + B2Pages + B3Pages;
        System.out.println("The total pages for all the books is: " + totalPages);

        // Average ratings for all the books
        int averageRating = totalPages / 3; // Use double for precision
        System.out.println("The average pages for all the books is: " + averageRating);

        // Does Circe have a higher rating than In the dream house?
        boolean circeVsITDH = B2Pages > B1Pages;
        System.out.println("Circe has more pages than In the dream house: " + circeVsITDH);
    }
}
