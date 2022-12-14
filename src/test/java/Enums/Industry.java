package Enums;

public enum Industry {
    AGRICULTURE ("Agriculture"),APPAREL("Apparel"),BANKING("Banking"),BIOTECHNOLOGY("Biotechnology"),CHEMICALS("Chemicals"),COMMUNICATIONS("Communications"),CONSTRUCTION("Construction"),CONSULTING("Consulting"),EDUCATION("Education"),ELECTRONICS("Electronics"),ENERGY("Energy"),ENGINEERING("Engineering"),ENTERTAINMENT("Entertainment"),ENVIRONMENTAL("Environmental"),FINANCE("Finance"),FOOD_AND_BEVERAGE("Food & Beverage"),GOVERNMENT("Government"),HEALTHCARE("Healthcare"),HOSPITALITY("Hospitality"),INSURANCE("Insurance"),MACHINERY("Machinery"),MANUFACTURING("Manufacturing"),MEDIA ("Media"),NOT_FOR_PROFIT("Not For Profit"),OTHER("Other"),RECREATION("Recreation"),RETAIL("Retail"),SHIPPING("Shipping"),TECHNOLOGY("Technology"),TELECOMMUNICATIONS("Telecommunications"),TRANSPORTATION("Transportation"), UTILITIES( "Utilities");
    private final String name;

    Industry(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Industry fromString(String value) {
        for (Industry contactIndustry : Industry.values()) {
            if (contactIndustry.getName().equals(value)) {
                return contactIndustry;
            }
        }
        return null;
    }
}
