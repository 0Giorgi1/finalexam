package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Airport implements LegalEntity {
    private List<Flight> flights = new ArrayList<>();
    private static final String FLIGHTS_FILE = "flights.ser";
    private String address;
    private String vatNumber;

    public Airport(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    public void addFlight(Flight f) {
        flights.add(f);
    }

    public boolean deleteFlight(Flight f) {
        return flights.remove(f);
    }

    public void saveFlightsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FLIGHTS_FILE))) {
            oos.writeObject(flights);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFlightsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FLIGHTS_FILE))) {
            flights = (List<Flight>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }
}