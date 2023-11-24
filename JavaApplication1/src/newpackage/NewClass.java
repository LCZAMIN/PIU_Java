/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NewClass {

    public void API(){
         try {
            // URL da API que deseja chamar
            URL url = new URL("https://openweathermap.org/api");
            
            // Abrir conexão HTTP
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            // Definir o método de requisição (GET, POST, etc.)
            conexao.setRequestMethod("GET");
            
            // Ler a resposta da requisição
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder resposta = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }
            reader.close();
            
            // Exibir a resposta da API
            System.out.println("Resposta da API:");
            System.out.println(resposta.toString());
            
            // Fechar a conexão
            conexao.disconnect();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
       
    }

