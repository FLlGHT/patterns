package patterns.proxy.geekmatchmaking;

/**
 * @author FLIGHT
 * @creationDate 26.04.2022
 */
public interface Person {

    String getName();
    String getGender();
    String getInterests();
    int getGeekRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setGeekRating(int rating);

}
