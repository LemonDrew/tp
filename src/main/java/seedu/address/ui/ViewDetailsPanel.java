package seedu.address.ui;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import seedu.address.model.person.Person;

public class ViewDetailsPanel extends UiPart<Region>{

    private static final String FXML = "ViewDetailsPanel.fxml";

    private Person person;

    @FXML
    private Label name;
    @FXML
    private Label phone;
    @FXML
    private Label email;
    @FXML
    private Label address;

    @FXML
    private Label job;

    public ViewDetailsPanel(Person person) {
        super(FXML);
        this.person = person;
        setPersonDetails(person);
    }

    public void setPersonDetails(Person person) {
        if (person != null) {
            name.setText(person.getName() != null ? person.getName().fullName : "N/A");
            job.setText(person.getJob() != null ? person.getJob().jobName : "N/A");
            phone.setText(person.getPhone() != null ? person.getPhone().value : "N/A");
            email.setText(person.getEmail() != null ? person.getEmail().value : "N/A");
            address.setText(person.getAddress() != null ? person.getAddress().value : "N/A");
        } else {
            name.setText("N/A");
            job.setText("N/A");
            phone.setText("N/A");
            email.setText("N/A");
            address.setText("N/A");
        }
    }

}
