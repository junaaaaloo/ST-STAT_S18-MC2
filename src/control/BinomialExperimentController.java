package control;

import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.ChoiceBox;

public class BinomialExperimentController extends AnchorPane {

	@FXML private Button generateButton;
	@FXML private TextField trialsField;
	@FXML private TableView includedTable;
	@FXML private TableColumn includedColumn;
	@FXML private TableColumn notIncludedColumn;
	@FXML private ChoiceBox outcomesComboBox;
	@FXML private Button notIncludeButton;
	@FXML private Button includeButton;
	@FXML private Button removeButton;

}
