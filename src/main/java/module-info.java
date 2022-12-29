module appointments.appointmentsapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens appointments.appointmentsapp to javafx.fxml;
    exports appointments.appointmentsapp;
}