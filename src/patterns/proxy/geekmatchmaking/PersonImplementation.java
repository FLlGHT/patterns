package patterns.proxy.geekmatchmaking;

/**
 * @author FLIGHT
 * @creationDate 26.04.2022
 */
public class PersonImplementation implements Person {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount;

    public PersonImplementation(String name, String gender, String interests, int rating, int ratingCount) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    public PersonImplementation(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getGeekRating() {
        if (ratingCount == 0) return 0;
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setGeekRating(int rating) {
        this.rating += rating;
        this.ratingCount++;
    }
}
