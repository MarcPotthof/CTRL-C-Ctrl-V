
// Hier wird mit dem Nutzer interagiert. Alles, was direkt mit dem Nutzer kommuniziert, sollte hier passieren.
// Das trennt die Logik der Verschlüsselungsalgorithmen von der Nutzerinteraktion.
// Dadurch wird der Code übersichtlicher und leichter erweiterbar.
public class UserInterface 
{
   Cipher[] verschluesselungsAlgorithmen;

   public UserInterface()
   {
      // hier können weitere Verschlüsselungsalgorithmen hinzugefügt
      // wichtig ist, dass die Kapazität des Arrays erhöht wird, falls sie nicht ausreicht (die Zahl in den Klammer erhöhen).
      verschluesselungsAlgorithmen = new Cipher[2];
      verschluesselungsAlgorithmen[0] = new Vorlage();
   }

   public void AlgorithmusWaehlen()
   {
      // Hier sollten alle verfügbaren Algorithmen angezeigt werden.
      // Anschließend sollte der Benutzer einen Algorithmus auswählen können,
      // das ganze sollte über die Konsole laufen.
   }

   public void TextVerschluesseln()
   {
      // Hier sollte der Benutzer aufgefordert werden, basierend auf dem ausgewähtem Algorithmus, einen Text und einen Schlüssel einzugeben.
      // Anschließend sollte der ausgewählte Algorithmus verwendet werden, um den Text zu verschlüsseln.
      // Das Ergebnis sollte dann in der Konsole ausgegeben werden.
   }

   public void TextEntschluesseln()
   {
      // Hier sollte der Benutzer aufgefordert werden, basierend auf dem ausgewähtem Algorithmus, einen Text und einen Schlüssel einzugeben.
      // Anschließend sollte der ausgewählte Algorithmus verwendet werden, um den Text zu entschlüsseln.
      // Das Ergebnis sollte dann in der Konsole ausgegeben werden.
   }
}
