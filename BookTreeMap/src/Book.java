package BookTreeMap.src;

public record Book(String isbn, String authors, int publicationYear, String origTitle, String title, double averageRating){

    public Book{
        if(isbn == null || isbn.isBlank()){
            throw new IllegalArgumentException("isbn cannot be null or empty");
        }
        if(authors == null || authors.isBlank()){
            throw new IllegalArgumentException("authors cannot be null or empty");
        }
        if(publicationYear == 0){
            throw new IllegalArgumentException("publicationYear must be less than or greater than 0");
        }
        if(title == null || title.isBlank()){
            throw new IllegalArgumentException("title cannot be null or empty");
        }
        if(averageRating < 0){
            throw new IllegalArgumentException("averageRating must not be negative");
        }
    }

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
