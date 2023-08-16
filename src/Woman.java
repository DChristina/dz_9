public class Woman extends Person{
    private String maidenlastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.maidenlastName = lastName;
    }
    @Override
    public void registerPartnership(Person newPartner){
        if (getPartner() == null) {
            this.partner = newPartner;
            this.setLastName(newPartner.getLastName());
        }
    }

    @Override
    public void  deregisterPartnership(Boolean divorceHappend){
        if (divorceHappend){
            setPartner(null);
            this.setLastName(getMaidenlastName());
        }
    }

    @Override
    public boolean isRetired() {
        return (this.getAge()>=60);
    }

    public String getMaidenlastName() {
        return maidenlastName;
    }

    public void setMaidenlastName(String maidenlastName) {
        this.maidenlastName = maidenlastName;
    }
}
