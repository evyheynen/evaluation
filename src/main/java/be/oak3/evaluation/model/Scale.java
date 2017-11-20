package be.oak3.evaluation.model;

public enum Scale {

    POOR("1"), FAIR("2"), AVERAGE("3"), GOOD("4"), EXCELLENT("5");

    private String abbreviation;
    Scale(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
