// Die Schnittstelle für Verschlüsselungsalgorithmen.
// Durch dieses Interface können verschiedene Algorithmen implementiert werden und nahtlos in das UserInterface integriert werden.

// Hier ist eine Erklärung von Oracle, die zwar etwas antik ist, aber recht simpel die Implementierung von Interfaces darstellt: 
// https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
// Die Nutzung von Interfaces wird sehr hier gut erklärt, ist aber komplizierter:
// https://www.dbs.ifi.lmu.de/Lehre/EIP/WS1213/skript/EIP-08-Interfaces.pdf
public interface Cipher 
{
   /**nimmt einen Text und einen Schlüssel entgegen und gibt den verschlüsselten Text zurück*/
   public String Verschluesseln(String text, String schluessel);

   /**nimmt einen verschlüsselten Text und einen Schlüssel entgegen und gibt den entschlüsselten Text zurück*/
   public String Entschluesseln(String text, String schluessel);

   /**gibt einen Infotext zurück, der angibt, wie der Schlüssel aussehen sollte, z.B. eine Zahl oder ein Text bestimmter Länge */
   public String SchluesselInfo();

   /**gibt einen String zurück, der angibt, unter welchem Namen dieser Verschlüsselungsalgorithmus angezeigt werden sollte */
   public String Name();
}
