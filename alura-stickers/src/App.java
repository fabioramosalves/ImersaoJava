import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       // Abrir um aconexao hppt
       //estrair os dados (titulo, poster, classifição)
       //Exibir e manipular

        var  url = "https://alura-imdb-api.herokuapp.com/movies";   
        URI address = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();
        
        var response = client.send(request, BodyHandlers.ofString());

        System.out.println(response.body());


    }
}
