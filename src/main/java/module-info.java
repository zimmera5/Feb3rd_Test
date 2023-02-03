module com.example.feb3rd_test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.feb3rd_test to javafx.fxml;
    exports com.example.feb3rd_test;
}