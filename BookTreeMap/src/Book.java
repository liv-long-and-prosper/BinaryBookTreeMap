package BookTreeMap.src;

import java.util.Objects;

public record Book(String isbn, String authors, int publicationYear, String origTitle, String title, double averageRating) implements Comparable<Book> {
    /**
     * Indicates whether some other object is "equal to" this one.  In addition
     * to the general contract of {@link Object#equals(Object) Object.equals},
     * record classes must further obey the invariant that when
     * a record instance is "copied" by passing the result of the record component
     * accessor methods to the canonical constructor, as follows:
     * <pre>
     *     R copy = new R(r.c1(), r.c2(), ..., r.cn());
     * </pre>
     * then it must be the case that {@code r.equals(copy)}.
     *
     * @param obj the reference object with which to compare.
     * @return {@code true} if this record is equal to the
     * argument; {@code false} otherwise.
     * @implSpec The implicitly provided implementation returns {@code true} if
     * and only if the argument is an instance of the same record class
     * as this record, and each component of this record is equal to
     * the corresponding component of the argument; otherwise, {@code
     * false} is returned. Equality of a component {@code c} is
     * determined as follows:
     * <ul>
     *
     * <li> If the component is of a reference type, the component is
     * considered equal if and only if {@link
     * Objects#equals(Object, Object)
     * Objects.equals(this.c, r.c)} would return {@code true}.
     *
     * <li> If the component is of a primitive type, using the
     * corresponding primitive wrapper class {@code PW} (the
     * corresponding wrapper class for {@code int} is {@code
     * java.lang.Integer}, and so on), the component is considered
     * equal if and only if {@code
     * PW.compare(this.c, r.c)} would return {@code 0}.
     *
     * </ul>
     * <p>
     * Apart from the semantics described above, the precise algorithm
     * used in the implicitly provided implementation is unspecified
     * and is subject to change. The implementation may or may not use
     * calls to the particular methods listed, and may or may not
     * perform comparisons in the order of component declaration.
     * @see Objects#equals(Object, Object)
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    /**
     * Returns a hash code value for the record.
     * Obeys the general contract of {@link Object#hashCode Object.hashCode}.
     * For records, hashing behavior is constrained by the refined contract
     * of {@link Record#equals Record.equals}, so that any two records
     * created from the same components must have the same hash code.
     *
     * @return a hash code value for this record.
     * @implSpec The implicitly provided implementation returns a hash code value derived
     * by combining appropriate hashes from each component.
     * The precise algorithm used in the implicitly provided implementation
     * is unspecified and is subject to change within the above limits.
     * The resulting integer need not remain consistent from one
     * execution of an application to another execution of the same
     * application, even if the hashes of the component values were to
     * remain consistent in this way.  Also, a component of primitive
     * type may contribute its bits to the hash code differently than
     * the {@code hashCode} of its primitive wrapper class.
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * Returns a string representation of the record.
     * In accordance with the general contract of {@link Object#toString()},
     * the {@code toString} method returns a string that
     * "textually represents" this record. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * <p>
     * In addition to this general contract, record classes must further
     * participate in the invariant that any two records which are
     * {@linkplain Record#equals(Object) equal} must produce equal
     * strings.  This invariant is necessarily relaxed in the rare
     * case where corresponding equal component values might fail
     * to produce equal strings for themselves.
     *
     * @return a string representation of the object.
     * @implSpec The implicitly provided implementation returns a string which
     * contains the name of the record class, the names of components
     * of the record, and string representations of component values,
     * so as to fulfill the contract of this method.
     * The precise format produced by this implicitly provided implementation
     * is subject to change, so the present syntax should not be parsed
     * by applications to recover record component values.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @apiNote It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     */
    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
