module polybiusciphergui.polybiusciphergui {
    requires javafx.controls;
    requires javafx.fxml;


    opens polybiusciphergui.main to javafx.fxml;
    exports polybiusciphergui.main;
}