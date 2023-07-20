public class Woman extends Person{
    private String maidenlastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.maidenlastName = lastName;
    }

    @Override
    public boolean isRetired() {
        return (this.getAge()>=60);
    }

    public void registerPartnership(Person partner){
        if (getPartner() == null) {
            super.setLastName(partner.getLastName());

        }
    }

    public void  deregisterPartnership(Boolean divorceHappend){
        if (divorceHappend){
            setPartner(null);
            this.setLastName(maidenlastName);
        }

    }

    public String getMaidenlastName() {
        return maidenlastName;
    }

    public void setMaidenlastName(String maidenlastName) {
        this.maidenlastName = maidenlastName;
    }
}
