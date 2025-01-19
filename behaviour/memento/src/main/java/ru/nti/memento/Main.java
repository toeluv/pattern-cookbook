package ru.nti.memento;

import ru.nti.memento.domain.Caretaker;
import ru.nti.memento.domain.Original;
import ru.nti.memento.domain.Snapshot;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new StringBuilder());
        TextEditorHistory history = new TextEditorHistory();
        editor.write("First Text");
        history.save(editor.save());
        System.out.println(history.getLast().toString());
        editor.write("Second Text");
        history.save(editor.save());
        System.out.println(history.getLast().toString());
        history.undo();
        System.out.println(history.getLast().toString());
    }
}

class TextSnapshot extends Snapshot {

    public TextSnapshot(Version version, String content) {
        super(version, content);
    }
}

class TextEditor implements Original {

    private StringBuilder currentText;
    private Version version;

    public TextEditor(StringBuilder currentText) {
        this.currentText = currentText;
        this.version = Version.create();
    }
    public void write(String text){
        currentText.append(text);
    }

    @Override
    public Snapshot save() {
        version.update();
        return new TextSnapshot(version, currentText.toString());
    }

    @Override
    public void restoreFrom(Snapshot snapshot) {
        currentText = new StringBuilder(snapshot.getContent());
        version = snapshot.getVersion();
    }
}

class TextEditorHistory implements Caretaker {

    private LinkedList<Snapshot> history = new LinkedList<>();

    @Override
    public void save(Snapshot snapshot) {
        history.add(snapshot);
    }

    @Override
    public Snapshot getLast() {
        return history.getLast();
    }

    @Override
    public Snapshot getByVersion(Version version) {
        return history.stream().filter(snapshot -> snapshot.getVersion().getVersion() == version.getVersion()).findFirst().get();
    }

    @Override
    public void undo() {
        history.removeLast();
    }
}
