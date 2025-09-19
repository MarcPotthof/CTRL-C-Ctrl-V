
// Diese Klasse dient als Vorlage für eigene Verschlüsselungsalgorithmen.
// Sie implementiert das Interface Cipher und muss daher die drei Methoden Verschluesseln, Entschluesseln und SchluesselInfo enthalten.
// Derzeit sind die Methoden nicht implementiert und geben nur den Eingabetext bzw. einen Beispieltext zurück.
// Die Klasse kann kopiert und umbenannt werden, um einen neuen Verschlüsselungsalgorithmus zu erstellen.
public class Vorlage implements Cipher
{
   // hier kann die echte Verschlüsselungslogik implementiert werden
   public String Verschluesseln(String text, String schluessel)
   {
      return text;
   }

   // hier kann die echte Entschlüsselungslogik implementiert werden
   public String Entschluesseln(String text, String schluessel)
   {
      return text;
   }

   // hier kann ein Infotext zurückgegeben werden, der angibt, wie der Schlüssel aussehen sollte
   public String SchluesselInfo()
   {
      return "Beliebiger Text";
   }

   // hier kann der Name des Verschlüsselungsalgorithmus zurückgegeben werden
   public String Name()
   {
      return "Vorlage";
   }
}
