package carros;

class car {
private String companyName;
private String modelName;
private int year;
private double mileage;


    public car(String companyName, String modelName, int year, double mileage) {
    this.companyName = companyName;
    this.modelName = modelName;
    this.year = year;
    this.mileage = mileage;
    }


    public String getCompanyName() {
    return companyName;
    }


    public void setCompanyName(String companyName) {
    this.companyName = companyName;
    }


    public String getModelName() {
    return modelName;
    }


    public void setModelName(String modelName) {
    this.modelName = modelName;
    }


    public int getYear() {
    return year;
    }


    public void setYear(int year) {
    this.year = year;
    }


    public double getMileage() {
    return mileage;
    }


    public void setMileage(double mileage) {
    this.mileage = mileage;
    }
}