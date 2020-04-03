import java.util.HashMap;

interface Validator {
    void validate();
}

class IN_Validator implements Validator {
    public void validate() {
        System.out.println("IN_Validator");
    }
}

class US_Validator implements Validator {
    public void validate() {
        System.out.println("US_Validator");
    }
}

public class AddressValidatorFactory {
    private static AddressValidatorFactory instance;
    static HashMap<String, Validator> CountryToValidator = new HashMap<>();

    private AddressValidatorFactory() {

        CountryToValidator.put("IN", new IN_Validator());
        CountryToValidator.put("US", new US_Validator());
    }

    public static AddressValidatorFactory getInstance() {
        if (instance == null) {
            instance = new AddressValidatorFactory();
        }
        return instance;
    }

    public Validator getValidator(String country) {
        if (CountryToValidator.containsKey(country)) {
            return CountryToValidator.get(country);
        }
        throw new Error("No country validation found for " + country);
    }

}