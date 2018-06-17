
package testdao1;

public class TestDAO1
 {

    public static void main(String[] args) 
{
  ContactsDAOimpl  c= new ContactsDAOimpl();
  c.addContact();
  c.findContactById();
  c.getAllContacts();
  c.removeContact();
  c.updateContact();
  }

}
  