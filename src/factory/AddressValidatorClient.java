package factory;

public class AddressValidatorClient {
    public static void main(String[] args) {
        System.out.println("AddressValidatorClient : Hello World");

        Validator IN_val = AddressValidatorFactory.getInstance().getValidator("IN");
        IN_val.validate();
        Validator US_val = AddressValidatorFactory.getInstance().getValidator("US");
        US_val.validate();
    }
}