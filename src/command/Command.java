package command;

/**
 * Created by jal on 2018/4/4 0004.
 */
public interface Command {
    void execute(String name);
    void undo();
}
