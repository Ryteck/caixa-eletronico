package application;

import com.google.gson.Gson;
import models.Banco;

import java.io.*;

public class JsonConvert {

    private Gson gson = new Gson();

    private static String json = "";

    public void serialization() { escrita(gson.toJson(Global.banco)); }

    private void escrita(String json) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Global.jsonPath, false))){
            bw.write(json);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deserialization() { leitura(); Global.banco = gson.fromJson(json, Banco.class); }

    private void leitura() {
            try (BufferedReader br = new BufferedReader(new FileReader(Global.jsonPath))) {
                json = br.readLine();
            } catch (FileNotFoundException e) {
                resetar();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public void resetar(){
        Global.banco = new Banco();
        new File(Global.jsonDirectory).mkdir();
        new File(Global.jsonPath);
        serialization();
    }
}
