
public class DBGame_v3 {

    GamePresentation presentation;
    GameTranslator translator;
    Database connection;

    public DBGame_v3() {
        //connection = new GameConnection("localhost", "3306", "version2", "root", "");
        connection = new Database("localhost", "3306", "version2", "root", "");

        translator = new GameTranslator(connection);
        presentation = new GamePresentation(translator, 600, 400);
        presentation.startRenderLoop();
    }

    public static void main(String[] args) {
        DBGame_v3 nyt_spil = new DBGame_v3(); //Kører denne klasses constructor
    }

}