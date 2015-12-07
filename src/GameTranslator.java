import java.util.Hashtable;
//import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class GameTranslator {
    private GameConnection connection;
    private Board board;

    public GameTranslator(GameConnection connection) {

        this.connection = connection;
    }

    public Hashtable getAllPieces() {
        //TODO lav et hashtable med alle pieces. Heriblandt players, moveable osv. og returner det derefter

        Hashtable allPieces = new Hashtable();

        Hashtable players = connection.getPieceData("players"); // getOnlyPlayers();
        Hashtable moveables = connection.getPieceData("moveables"); //getOnlyMoveables();
        Hashtable pieces = connection.getPieceData("pieces"); //getOnlyPieces();

        allPieces.put("players", players);
        allPieces.put("moveables", moveables);
        allPieces.put("pieces", pieces);


        return allPieces;
    }
}
