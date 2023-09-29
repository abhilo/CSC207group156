import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APICallExample {


    // This method generate the access code that is need for the Spotify API.
//    public static void main(String[] args) throws IOException, InterruptedException {
//
//
////        .header("v1", "Content-Type: application/x-www-form-urlencoded")
////                .header("v2", "grant_type=client_credentials&client_id=11d73b5dea134ad89de266eee9b4db5d&client_secret=5341f28addc940dc83860492caaffdd9")
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().header("Content-Type", "application/x-www-form-urlencoded")
//                .uri(URI.create("https://accounts.spotify.com/api/token"))
//                .POST(HttpRequest.BodyPublishers.ofString("grant_type=client_credentials&client_id=11d73b5dea134ad89de266eee9b4db5d&client_secret=5341f28addc940dc83860492caaffdd9"))
//                .build();
//
//        HttpResponse<String> response = client.send(request,
//                HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());
//    }

    // Get method that makes various requests to access certain information from the Spotify API.
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().header("Authorization", "Bearer  BQCx22wBjPsqPKgFIG5W40F6xPDeV2u9r49mRRSm91ZtO-UcsizFfjgn9xe69MUA9bbDrT7QvsgFATq02FDUbdC3KyP7SPfqw0bbao882QHcifZNmwQ")
                .uri(URI.create("https://api.spotify.com/v1/artists/3TVXtAsR1Inumwj472S9r4"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }


//    public static void main2(String[] args) throws IOException, InterruptedException {
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://api.spotify.com/v1/tracks/2TpxZ7JUBn3uw46aR7qd6V"))
//                .build();
//
//        HttpResponse<String> response = client.post(request,
//                HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());
//    }
//




//    public static void main(String[] args){
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://api.spotify.com/"))
//                .build();
//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();
//
//
//        HttpResponse<Void> response = client.send(request,
//                HttpResponse.BodyHandlers.discarding());
//
//        System.out.println(response.statusCode());
//    }


//    public static void main(String[] args){
//
//        try {
//            String u = "https://api.spotify.com";
//            URL url = new URL(u);
//        } catch (MalformedURLException e) {
//            return;
//        }
//
//
//    }
}
