package BookTreeMap.src;

public record Book(String isbn, String authors, int publicationYear, String origTitle, String title, double averageRating){

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != Book.class){
            throw new IllegalArgumentException("obj must be of type Book");
        }
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return "\nISBN Code:\t" +isbn+"\nAuthors:\t"+authors+"\nOriginal Title:\t"+origTitle+"\nTitle:\t"+title+"\nAverage Rating:\t"+averageRating;
    }
}
