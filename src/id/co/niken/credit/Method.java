/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.niken.credit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nikenhapsari
 */
public class Method {
    public Method() {

    }
    public List<Client> getDataFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        List<Client> client = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] stringArray = line.split(",");
            Date d = df.parse(stringArray[7].trim());
            Client pisah = new Client(stringArray[0], stringArray[1].trim(), Integer.parseInt(stringArray[2].trim()),
                    stringArray[3].trim(), Boolean.parseBoolean(stringArray[4].trim()), Double.parseDouble(stringArray[5].trim()),
                    stringArray[6].trim(), d, Integer.parseInt(stringArray[8].trim()), stringArray[9], stringArray[10]);
            client.add(pisah);
        }
        return client;
    }

    public List<History> getHistoryFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);
        List<History> history = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] stringArray = line.split(",");
            Client cl = new Client();
            cl.setKode(stringArray[0]);
            History pisah = new History(cl, stringArray[1].trim(), stringArray[2].trim(), Double.parseDouble(stringArray[3].trim()),
                    Double.parseDouble(stringArray[4].trim()), Integer.parseInt(stringArray[5].trim()),
                    Integer.parseInt(stringArray[6].trim()), Integer.parseInt(stringArray[7].trim()),
                    stringArray[8].trim(), Double.parseDouble(stringArray[9].trim()));
            history.add(pisah);
        }
        return history;
    }

}
