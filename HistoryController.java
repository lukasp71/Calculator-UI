package calc.controllers;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class HistoryController {
    
    @FXML
    private ListView historyList;
    
    public void initializeCalculations(ArrayList<String> calculation_History) {
        calculation_History.forEach((calculation) -> {
            historyList.getItems().add(calculation);
        });
       
    }
}
