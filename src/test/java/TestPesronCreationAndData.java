
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPesronCreationAndData {

        Man person1 = new Man("Tom","Sot", 35);
        Woman person2 = new Woman("Lola","Huston",24);
        Man person3 = new Man("Nikki","lius",66);
        Woman person4  = new Woman("Jane","Loverson",61);


    @Test
    public void testChekingNamesSurnamesOfPerson(){
        Assert.assertEquals(person1.getLastName(),"Sot","There is an error in the getting last name process!");
        Assert.assertEquals(person1.getFirstName(),"Tom","There is an error in the getting first name process!");
        person2.setLastName("Humster");
        Assert.assertEquals(person2.getLastName(),"Humster","There is an error in the setting last name process!");
        person3.setFirstName("Nikol");
        Assert.assertEquals(person3.getFirstName(),"Nikol","There is an error in the setting first name process!");
    }

    @Test
    public void testChekingAgeOfPerson(){
        Assert.assertEquals(person1.getAge(),35,"There is an error in the getting ages process!");
        person1.setAge(25);
        Assert.assertEquals(person1.getAge(),25,"There is an error in the setting ages process is wrong!");
    }
    @Test
    public void testIsPersonHasRetiredStatus(){
        Assert.assertTrue(person3.isRetired(),"There is an error in the person checking retire status process!");
        Assert.assertTrue(person4.isRetired(),"There is an error in the person checking retire status process!");
        Assert.assertFalse(person1.isRetired(),"There is an error in the person checking retire status process!");
        Assert.assertFalse(person2.isRetired(),"There is an error in the person checking retire status process!");
    }

    @Test
    public void testSettingPartnerProcessForWoman(){
        person4.registerPartnership(person1);
        Assert.assertEquals(person1.getPartner(),person4, "Setting partners doesn't work!");
        Assert.assertEquals(person4.getPartner(),person1, "Setting partners doesn't work!");
        Assert.assertEquals(person4.getLastName(),"Sot", "Changing last name after getting merriged doesn't work!");
    }
    @Test
    public void testSettingPartnerProcessForMan(){
        person1.registerPartnership(person4);
        Assert.assertEquals(person1.getPartner(),person4, "Setting partners doesn't work!");
        Assert.assertEquals(person4.getPartner(),person1, "Setting partners doesn't work!");
        Assert.assertEquals(person4.getLastName(),"Sot", "Changing last name after getting merriged doesn't work!");
    }

    @Test
    public void testDeregisteringOfPartnershipForMan(){
        person1.registerPartnership(person4);
        person1.deregisterPartnership(true);
        Assert.assertNull(person4.getPartner(), "Deregisting partners process doesn't work!");
        Assert.assertNull(person1.getPartner(), "Deregisting partners process doesn't work!");
        Assert.assertEquals(person4.getLastName(),"Loverson", "Changing last name after got divorced doesn't work!");
        Assert.assertEquals(person1.getLastName(),"Sot", "Last name for name was changed!");
    }

    @Test
    public void testDeregisteringOfPartnershipForWonan(){
        person4.registerPartnership(person1);
        person4.deregisterPartnership(true);
        Assert.assertNull(person4.getPartner(), "Deregisting partners process doesn't work!");
        Assert.assertNull(person1.getPartner(), "Deregisting partners process doesn't work!");
        Assert.assertEquals(person4.getLastName(),"Loverson", "Changing last name after got divorced doesn't work!");
        Assert.assertEquals(person1.getLastName(),"Sot", "Last name for name was changed!");
    }
}
