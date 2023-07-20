module com.example.academicinternship {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.academicinternship to javafx.fxml;
    exports com.example.academicinternship;
}