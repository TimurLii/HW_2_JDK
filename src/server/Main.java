package server;

import server.client.ClientController;
import server.client.ClientGUI;
import server.server.ServerController;
import server.server.repository.FileStorage;
import server.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerController serverController = new ServerController(new ServerWindow(), new FileStorage());

       new ClientController(new ClientGUI(), serverController);
       new ClientController(new ClientGUI(), serverController);
    }
}
