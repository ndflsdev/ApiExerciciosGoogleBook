import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Scanner;

public class ConsultaCotacaoCripto {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("digite a moeda que deseja cotar: ");
        var busca = leitura.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + busca +  "CG-XYP4kuGoHDqXE4urJfvq9rXT";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

    }
}