module com.example.csc311_gui_basics {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_gui_basics to javafx.fxml;
    exports com.example.csc311_gui_basics;
}