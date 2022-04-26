package patterns.proxy.geekmatchmaking;

/**
 * @author FLIGHT
 * @creationDate 26.04.2022
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive testDrive = new MatchMakingTestDrive();
        testDrive.drive();
    }

    private void drive() {
        ProxyHelper proxyHelper = new ProxyHelper();
        Person user = new PersonImplementation("Michael", "M", "IT" , 10, 5);
        testOwnerProxy(proxyHelper, user);
        testNonOwnerProxy(proxyHelper, user);
    }

    private void testOwnerProxy(ProxyHelper proxyHelper, Person user) {
        Person ownerProxy = proxyHelper.getProxy(true, user);

        ownerProxy.setInterests("golf, golf");
        System.out.println("Interests set from owner proxy");

        try {
            ownerProxy.setGeekRating(10);
        }
        catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getGeekRating());
    }

    private void testNonOwnerProxy(ProxyHelper proxyHelper, Person user) {
        Person nonOwnerProxy = proxyHelper.getProxy(false, user);
        try {
            nonOwnerProxy.setInterests("golf, golf");
        }
        catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
    }
}
