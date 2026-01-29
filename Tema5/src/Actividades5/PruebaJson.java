package Actividades5;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PruebaJson {
    public static void main(String[] args) {
        //Recordar procesar
        try {
            //Lectura del contenido del fichero JSON
            Object ob = new JSONParser().parse(new FileReader("src/Prueba.json"));
            //Convertir objeto a JSON y procesarlo
            JSONObject js = (JSONObject) ob;
            String firstName = (String) js.get("firstName");
            String lastName = (String) js.get("lastName");
            System.out.println("First name is: " + firstName);
            System.out.println("Last name is: " + lastName);
            JSONArray arr = (JSONArray) js.get("phoneNumbers");
            //Recorre cada elementos del array
            for (Object item : arr) {
                JSONObject data = (JSONObject) item;
                String post_id = (String) data.get("phone-number");
                System.out.println(post_id);
            }

        } catch (Exception e) {
            System.out.println("Algo salió mal");
        }
    }
}
