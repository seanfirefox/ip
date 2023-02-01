package command;

import dukeexception.DukeException;
import store.Storage;
import store.TaskList;
import userinteraction.Ui;

/**
 * Command class for listing all tasks.
 */
public class ListCommand extends Command {
    /**
     * Public constructor.
     *
     * @param inputArr String array from user input.
     */
    public ListCommand(String[] inputArr) {
        super(inputArr);
    }

    /**
     * Lists all tasks.
     *
     * @param taskList Stores all tasks.
     * @param ui       Handles all user interaction.
     * @param storage  Handles all storage of tasks in a file.
     * @throws DukeException Checks if input is valid.
     */
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        taskList.listTask(inputArr);
    }

    /**
     * Does not exit program.
     *
     * @return Boolean to exit program.
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
