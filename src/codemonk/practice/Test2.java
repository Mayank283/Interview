package codemonk.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7118284536360487861L;

	private String city;

	private String country;

	private String street;

	private Contact contact;

	private int value;

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", street=" + street + ", contact=" + contact
				+ ", value=" + value + "]";
	}
}

class Contact {

}

public class Test2 {
	public static void main(String[] args) {

		Set<Address> set = new HashSet<Address>();

		Process process = Process.MassProcess;
		System.out.println(process.getType());
		Address a = process.getAddress();
		a.setCity("Mathura");
		System.out.println(process.getAddress());
		System.out.println(process.getAddress().hashCode());
		System.out.println(process.hashCode());
		set.add(process.getAddress());

		try {

			FileOutputStream fout = new FileOutputStream("process.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(process);
			oos.close();
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		Process desProcess;
		try {

			FileInputStream fin = new FileInputStream("process.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			desProcess = (Process) ois.readObject();
			ois.close();

			System.out.println(desProcess.getType());
			System.out.println(process.getAddress());
			System.out.println(process.getAddress().hashCode());
			System.out.println(desProcess.hashCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		/*************** Checking for Address object *******************/

		Address address = new Address();
		address.setStreet("wall street");
		address.setCountry("united states");
		System.out.println("Hashcode for address " + address.hashCode());
		System.out.println(address);
		set.add(address);
		try {

			FileOutputStream fout = new FileOutputStream("address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		/** Deserializing */
		Address desAddress;
		try {

			FileInputStream fin = new FileInputStream("address.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			desAddress = (Address) ois.readObject();
			ois.close();

			System.out.println("Hashcode for deserialized address " + desAddress.hashCode());
			System.out.println(desAddress);
			set.add(desAddress);
			System.out.println("**************" + set);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}

enum Process {

	MassProcess("mass", new Address());

	String type;

	Address address;

	String getType() {
		return type;
	}

	Address getAddress() {
		return address;
	}

	Process(String type, Address address) {
		this.type = type;
		this.address = address;
	}

}