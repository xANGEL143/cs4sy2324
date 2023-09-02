public class Books {
    /**
     * @param args
     */
    public static void main(String[] args){
        //Book 1 
        String B1Name = "In the dream house";
        String B1Genre = "Carmen Maria Machado";
        int B1GoodreadsRate = 4.45;

        //Book 2
        String B2Name = "Circe";
        String B2Genre = "Madeline Miller";
        int B2GoodreadsRate = 4.24;

        //Book 3
        String B3Name = "Piranesi";
        String B3Genre = "Susanna Clarke";
        int B3GoodreadsRate = 4.23;

        //Book 1 Information printing
        System.out.println("Book Name: " + B1Name);
        System.out.println("Book Author: " + B1Genre);
        System.out.println("Book ratings from goodreads: " + B1GoodreadsRate);
        
        //Book 2 Information printing
        System.out.println("Book Name: " + B2Name);
        System.out.println("Book Author: " + B2Genre);
        System.out.println("Book ratings from goodreads: " + B2GoodreadsRate);

        //Book 3 Information printing
        System.out.println("Book Name: " + B3Name);
        System.out.println("Book Author: " + B3Genre);
        System.out.println("Book ratings from goodreads: " + B3GoodreadsRate);

        //Total rating for all the books
        int totalRatings= B1GoodreadsRate + B2GoodreadsRate + B3GoodreadsRate;
        System.out.println("The total rating for all the books is: " + totalRatings);

        //Average ratings for all the books
        int averageRating = totalRatings/ 3; 
        System.out.println("The average rating for all the books is: " + averageRating);

        //Does Crice have a higher rating than In the dream house? 
        boolean circeVsITDH = B1GoodreadsRate < B2GoodreadsRate;
        System.out.println("Circe has a higher rating than In the dream house: " + circeVsITDH); 
   
    }

}
