package org.example;

import org.jline.keymap.KeyMap;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.NonBlockingReader;

public class TerminalKeyListener {
    public static void main(String[] args) {
        try {
            Terminal terminal = TerminalBuilder.builder().system(true).build();
            LineReader lineReader = LineReaderBuilder.builder().terminal(terminal).build();

            NonBlockingReader reader = terminal.reader();
            KeyMap<LineReader.Candidate> keyMap = lineReader.getKeyMaps().get("main");

            while (true) {
                int key = reader.read(1, false);
                if (key == -1) {
                    // Kein Eingabetastendruck, weitermachen oder beenden
                    continue;
                }

                String input = new String(Character.toChars(key));
                System.out.println("Taste gedrückt: " + input);
                // Hier kannst du den Code einfügen, der auf den Tastendruck reagieren soll

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Aktualisiere den KeyMap-Status für die nächste Eingabe
                keyMap.bindings().forEach(b -> b.getKeyMap().remove(b));
                lineReader.callWidget(LineReader.CLEAR);
            }

            terminal.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
