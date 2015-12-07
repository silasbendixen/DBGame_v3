import java.sql.*;

public class DBGame_v3 {

    GamePresentation presentation;
    GameTranslator translator;
    GameConnection connection;

    public DBGame_v3() {
        connection = new GameConnection("localhost", "3306", "DatabaseTest", "root", "");
        translator = new GameTranslator(connection);
        presentation = new GamePresentation(translator, 600, 400);
        presentation.startRenderLoop();
    }

    public static void main(String[] args) {

    }

}