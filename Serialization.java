/*Write a java program, how to implement serialization for a given object. Use required classes and process to complete the serialization. 
for example take Customer(id, name, contactNo and address) class, use should write the java code, how to serialize Customer object to JavaObject.txt file. */
import java.io.*;

// Define the Customer class
class Customer implements Serializable 
{
    //private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String contactNo;
    private String address;

    // Constructor
    public Customer(int id, String name, String contactNo, String address) 
    {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    // Getters and setters
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getContactNo() 
    {
        return contactNo;
    }

    public void setContactNo(String contactNo) 
    {
        this.contactNo = contactNo;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    @Override
    public String toString() 
    {
        return "Customer{" + "id=" + id + ", name='" + name + '\'' +  ", contactNo='" + contactNo + '\'' + ", address='" + address + '\'' + '}';
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(1, "Abc Xyz", "6878534576", "Andhra Pradesh");

        // Serialize the Customer object to a file named JavaObject.txt
        serializeObject(customer, "JavaObject.txt");

        System.out.println("Customer object serialized successfully.");
    }

    // Method to serialize an object to a file
    public static void serializeObject(Object obj, String fileName) 
    {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) 
        {
            objectOut.writeObject(obj);
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}







